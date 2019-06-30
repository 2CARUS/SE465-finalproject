package com.se465.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se465.logic.DataHandler;
import com.se465.pojo.CalendarFeedResponse;
import com.se465.pojo.HttpResponseObject;

@RestController
public class EventFeedController {
	@RequestMapping("/events")
	public HttpResponseObject retrieveCF() {
		
		return DataHandler.getInstance().getCFeed();
	}
	

}
