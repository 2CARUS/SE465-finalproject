package com.se465.pojo;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)                 
public class CalendarFeed
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
	

			
	
