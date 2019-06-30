package com.se465.subscription;

import javax.servlet.http.HttpServletResponse;

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
		// TODO Send Email at appropriate time
		
		
		return new SubscriptionResponse
				(
					HttpServletResponse.SC_ACCEPTED, 
					HashIdHandler.getInstance().generateId( subscriptionRequest.toString() ), 
					subscriptionRequest
				);
	}
}
