package com.se465.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se465.data.DataHandler;
import com.se465.pojo.HttpResponseObject;

@RestController
public class EventFeedController {
	@RequestMapping("/events")
	public HttpResponseObject retrieveCF() {
		
		return DataHandler.getInstance().getCFeed();
	}
	

}
