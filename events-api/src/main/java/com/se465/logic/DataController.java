package com.se465.logic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.se465.pojo.CalendarFeed;
import com.se465.pojo.Vevents;

import lombok.Getter;

public class DataController {
	/**
	* static Singleton instance.
	*/
	private static volatile DataController instance;
	@Getter
	private CalendarFeed cFeed;
	@Getter
	private ArrayList<Vevents> events;

	/**
	* Private constructor for singleton.
	*/
	private DataController() {
		this.parseData();
	}

	/**
	* Return a singleton instance of DataInit.
	*/
	public static DataController getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (DataController.class) {
				if (instance == null) {
					instance = new DataController();
				}
			}
		}
		return instance;
	}
	private void parseData() {
		ObjectMapper mapper = new ObjectMapper();
		String filepath = "src/main/resources/data/events.json";
		try {

			// Convert JSON string from file to Object
			CalendarFeed cFeed = mapper.readValue(new File(filepath), CalendarFeed.class);

			System.out.println(cFeed);
			this.clean_cFeed(cFeed);
			System.out.println(cFeed.getEvents().get(0));			

			
			
			
			
			this.cFeed = cFeed;


		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@SuppressWarnings("unchecked")
	private void clean_cFeed(CalendarFeed cFeed) {
		// TODO Auto-generated method stub
		
		
		cFeed.setEvents(new ArrayList<Vevents>(Arrays.asList(cFeed.getVevents())));
		for (Vevents event : cFeed.getEvents()) {
			event.setUid(event.getUid().replaceAll("[^0-9]", ""));
		}
		
	}

	public Vevents searchEvent(String uid) {
		this.events = this.cFeed.getEvents();
		List<Vevents> found = this.events.stream().filter(event -> event.getUid().equals(uid)).collect(Collectors.toList());
		return found.get(0);
	}
	
}
