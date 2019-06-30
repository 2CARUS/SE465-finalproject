package com.se465.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.se465.logic.DataController;
import com.se465.pojo.CalendarFeed;
import com.se465.pojo.SchoolEvent;

@RestController
public class EventSearchController {

		@RequestMapping("/event")
		public SchoolEvent lookupSchoolEvent
			(
				@RequestParam(value="uid", defaultValue="-1")
				String uid
			) 
		{
			
			return new SchoolEvent(DataController.getInstance().searchEvent(uid));
		}
	}