package com.se465.subscription;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.se465.pojo.CalendarFeedResponse;
import com.se465.pojo.HttpResponseObject;
import com.se465.pojo.SubscriptionRequest;
import com.se465.pojo.SubscriptionResponse;

public class SubscriptionHandler {
	/**
	* static Singleton instance.
	*/
	private static volatile SubscriptionHandler instance;
	
	/**
	* Private constructor for singleton.
	*/
	private SubscriptionHandler() {
	}
	
	/**
	* Return a singleton instance of SubscriptionHandler.
	*/
	public static SubscriptionHandler getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (SubscriptionHandler.class) {
				if (instance == null) {
					instance = new SubscriptionHandler();
				}
			}
		}
		return instance;
	}

	public HttpResponseObject handleRequest(SubscriptionRequest subscriptionRequest) {
		return EmailHandler.getInstance().confirmationResponse(subscriptionRequest);
	}

	// Can be refactored to not copy paste the Data Handler code
	public HttpResponseObject badRequest() {
		ObjectMapper mapper = new ObjectMapper();
		String filepath = "src/main/resources/templates/SubscriptionResponse.json";
		try {

			// Convert JSON string from file to Object
			SubscriptionResponse jsonData = mapper.readValue(new File(filepath), SubscriptionResponse.class);

			return jsonData;


		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
