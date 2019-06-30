package com.se465.ics;

public class CalendarFeed
{
    private String success;

    private Vcalendar[] vcalendar;

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    public Vcalendar[] getVcalendar ()
    {
        return vcalendar;
    }

    public void setVcalendar (Vcalendar[] vcalendar)
    {
        this.vcalendar = vcalendar;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [success = "+success+", vcalendar = "+vcalendar+"]";
    }
}
			
	
