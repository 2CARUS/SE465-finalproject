package com.se465.subscription;

import java.util.Properties;

import javax.servlet.http.HttpServletResponse;

import com.se465.pojo.ErrorResponse;
import com.se465.pojo.HttpResponseObject;
import com.se465.pojo.SubscriptionRequest;
import com.se465.pojo.SubscriptionResponse;

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

	public void sendEmail(String address) {
		// TODO Auto-generated method stub
		
	}

	public HttpResponseObject confirmationResponse(SubscriptionRequest sreq) {
		// TODO Send Email at appropriate time
		
		if (this.planEmail(sreq)) {
			return new SubscriptionResponse
				(
					HttpServletResponse.SC_ACCEPTED, 
					HashIdHandler.getInstance().generateId( sreq.toString() ), 
					sreq
				);
		}
		return new ErrorResponse("Something went wrong in the email stage");
	}

	private boolean planEmail(SubscriptionRequest sreq) {
		// TODO Auto-generated method stub
		
		return true;
		
	}
}
