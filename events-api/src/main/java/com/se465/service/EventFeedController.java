package com.se465.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se465.logic.DataController;
import com.se465.pojo.CalendarFeed;

@RestController
public class EventFeedController {
	@RequestMapping("/events")
	public CalendarFeed retrieveCF() {
		
		return DataController.getInstance().getCFeed();
	}
	

}
