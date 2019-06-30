package com.se465.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.se465.data.DataHandler;
import com.se465.pojo.HttpResponseObject;
import com.se465.pojo.SchoolEventResponse;
import com.se465.pojo.Vevents;

@RestController
public class EventSearchController extends AbstractEventController {

		@RequestMapping("/event")
		public HttpResponseObject lookupSchoolEvent
			(
				@RequestParam(value="uid", defaultValue="-1")
				String uid
			) 
		{
			
			try {
				Object obj = DataHandler.getInstance().searchEvent(uid);
				return new SchoolEventResponse((Vevents) obj);
			} catch (Exception e) {

				return this.errorResponse("Please use query field of 'event?uid=<<id>>' to search for a valid uid",e.toString());
			}
		}
	}