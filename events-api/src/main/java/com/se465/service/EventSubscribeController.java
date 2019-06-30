package com.se465.service;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.se465.subscription.SubscriptionHandler;
import com.se465.pojo.HttpResponseObject;
import com.se465.pojo.SubscriptionRequest;
import com.se465.pojo.SubscriptionResponse;

@RestController
public class EventSubscribeController extends AbstractEventController {
	@RequestMapping(value = "/subscribe", method = RequestMethod.POST)
	@ResponseBody
	public HttpResponseObject postSubscriptionRequest(@RequestBody SubscriptionRequest subscriptionRequest, HttpServletResponse response) {
		
		
		SubscriptionResponse sr = (SubscriptionResponse) SubscriptionHandler.getInstance().handleRequest(subscriptionRequest);
		
		
		if (sr.getStatus() == (HttpServletResponse.SC_ACCEPTED)) {
			response.setStatus(HttpServletResponse.SC_CREATED);
			sr.setStatus(HttpServletResponse.SC_CREATED);
			return sr; 
		} else {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return SubscriptionHandler.getInstance().badRequest();
		}
	}
	
//	@RequestMapping(value="/subscribe",  method = RequestMethod.GET)
	@RequestMapping("/subscribe")
	public HttpResponseObject getSubscribe() {
		return this.errorResponse("Attempted to GET '/subscribe' endpoint\n please submit body of `uid, email, reminder:{unit, value}");
	}

}
