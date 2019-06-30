package com.se465.pojo;

import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)                 
public class CalendarFeedResponse implements HttpResponseObject
{
    private Vevents[] vevents;
    
    @Getter
    @Setter
    private ArrayList<Vevents> events;

    public Vevents[] getVevents ()
    {
        return vevents;
    }

    public void setVevents (Vevents[] vevents)
    {
        this.vevents = vevents;
    }
    @Override
    public String toString()
    {
        return "ClassPojo [ vevents = "+vevents+"]";
    }
}
	

			
	
