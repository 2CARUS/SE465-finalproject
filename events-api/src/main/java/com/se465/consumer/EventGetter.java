package com.se465.consumer;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.se465.pojo.CalendarFeed;
import com.se465.pojo.SchoolEvent;

public class EventGetter {
	/**
	 * static Singleton instance.
	 */
	private static volatile EventGetter instance;
	private RestTemplate restTemplate;
	private CalendarFeed cf;
	
	/**
	 * Private constructor for singleton.
	 */
	private EventGetter() {
		this.restTemplate = new RestTemplate();
		this.cf = restTemplate.getForObject(CONST.CF_URL, CalendarFeed.class);
	}
	
	/**
	 * Return a singleton instance of EventGetter.
	 */
	public static EventGetter getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (EventGetter.class) {
				if (instance == null) {
					instance = new EventGetter();
				}
			}
		}
		return instance;
	}

	public List<SchoolEvent> getEvents() {
		
		
		return null;
	}

	public CalendarFeed getCF() {
		// TODO Auto-generated method stub
		return this.restTemplate.getForObject(CONST.CF_URL, CalendarFeed.class);
	}
}
