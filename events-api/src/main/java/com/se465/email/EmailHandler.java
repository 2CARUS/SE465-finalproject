package com.se465.email;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.se465.data.DataHandler;
import com.se465.exceptions.TimeUnitException;
import com.se465.pojo.ErrorResponse;
import com.se465.pojo.HttpResponseObject;
import com.se465.pojo.SubscriptionRequest;
import com.se465.pojo.SubscriptionResponse;
import com.se465.subscription.HashIdHandler;

@Component
public class EmailHandler {
	/**
	* static Singleton instance.
	*/
	private static volatile EmailHandler instance;
	
	/**
	* Private constructor for singleton.
	*/
	private EmailHandler() {
		this.init();
	}
	
	private void init() {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.mailtrap.io");
		prop.put("mail.smtp.port", "25");
		prop.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");
		
	}

	/**
	* Return a singleton instance of EmailHandler.
	*/
	public static EmailHandler getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (EmailHandler.class) {
				if (instance == null) {
					instance = new EmailHandler();
				}
			}
		}
		return instance;
	}

	public void sendEmail(SubscriptionResponse response) {
		String body = (
				String.format("HTML formatting not implemented%nPrinting SubscriptionResponse:%n%s%nEventData:%n%s", 
				response.toString(), (
						DataHandler
						.getInstance()
						.searchEvent(
								response
								.getSubscriptionRequest()
								.getUid()
						)
					).toString()
				)
			);

		new EmailServiceImpl()
		.sendSimpleMessage
		(
				response
				.getSubscriptionRequest()
				.getEmail(), 
				"Event Reminder from SCSU Hub", 
				body 
		);
		
	}

	public HttpResponseObject confirmationResponse(SubscriptionRequest sreq) {
		// TODO Send Email at appropriate time
		SubscriptionResponse subResponse = new SubscriptionResponse
				(
						HttpServletResponse.SC_ACCEPTED, 
						HashIdHandler.getInstance().generateId( sreq.toString() ), 
						sreq
				);
		
		
		if (this.planEmail(subResponse)) {
			return subResponse;
		}
		return new ErrorResponse("Something went wrong in the email stage");
	}

	private boolean planEmail(SubscriptionResponse emailResponse) {
		
		int ms = EmailHandler.getInstance().parseTime(emailResponse);
		
		
		EmailThread emailThread = new EmailThread
				(
					//get MD5 hash to attach to thread adapter	
					emailResponse.getSid(),
					// make a new thread
					new Thread
					( 
						new Runnable() {
					        public void run()  {
					            try  { 
					            	Thread.sleep( ms ); //this is in ms
				            	}
					            catch (InterruptedException ie)  {
					            	System.out.println(ie.toString());
					            }
					            EmailHandler.getInstance().sendEmail(emailResponse);
					        }
					    } 
					)
				);
		
		EmailThreadsStore.getInstance().addAndStart(emailThread);
		
		return true;
		
		
	}

	private int parseTime(SubscriptionResponse responseObject) {
		
		
			if (responseObject
					.getSubscriptionRequest()
					.getReminder()
					.getUnit()
					.toUpperCase()
					.equals(UNIT.MS)) {
				return responseObject
						.getSubscriptionRequest()
						.getReminder()
						.getValue();
			}
			try {
				throw new TimeUnitException("Please specify MS as your time unit; others are not implemented");
			} catch (TimeUnitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return -1;
		 
		
	}
}
