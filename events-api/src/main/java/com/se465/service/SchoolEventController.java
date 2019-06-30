package com.se465.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se465.consumer.EventGetter;
import com.se465.ics.CalendarFeed;

@RestController
public class SchoolEventController {
	@RequestMapping("/feed")
	public CalendarFeed retrieveCF() {
		return EventGetter.getInstance().getCF();
	}
	
//	@RequestMapping("events")
//	public List<SchoolEvent> retrieveAllEvents() {
//		
//		List<SchoolEvent> schoolevents = EventGetter.getInstance().getEvents();
//		
//		
//		
//		
//		
//		
//		return schoolevents;
//		
//	}
	

}
