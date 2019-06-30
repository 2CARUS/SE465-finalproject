package com.se465.pojo;

public class Vevent
{
    private String summary;

    private String sequence;

    private String uid;

    private String x_hosts;

    private String description;

    private String location;

    private String categories;

    private String dtend;

    private String dtstart;

    private String url;

    private String dtstamp;

    private String status;

    public String getSummary ()
    {
        return summary;
    }

    public void setSummary (String summary)
    {
        this.summary = summary;
    }

    public String getSequence ()
    {
        return sequence;
    }

    public void setSequence (String sequence)
    {
        this.sequence = sequence;
    }

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public String getX_hosts ()
    {
        return x_hosts;
    }

    public void setX_hosts (String x_hosts)
    {
        this.x_hosts = x_hosts;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getLocation ()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public String getCategories ()
    {
        return categories;
    }

    public void setCategories (String categories)
    {
        this.categories = categories;
    }

    public String getDtend ()
    {
        return dtend;
    }

    public void setDtend (String dtend)
    {
        this.dtend = dtend;
    }

    public String getDtstart ()
    {
        return dtstart;
    }

    public void setDtstart (String dtstart)
    {
        this.dtstart = dtstart;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getDtstamp ()
    {
        return dtstamp;
    }

    public void setDtstamp (String dtstamp)
    {
        this.dtstamp = dtstamp;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [summary = "+summary+", sequence = "+sequence+", uid = "+uid+", x-hosts = "+x_hosts+", description = "+description+", location = "+location+", categories = "+categories+", dtend = "+dtend+", dtstart = "+dtstart+", url = "+url+", dtstamp = "+dtstamp+", status = "+status+"]";
    }
}