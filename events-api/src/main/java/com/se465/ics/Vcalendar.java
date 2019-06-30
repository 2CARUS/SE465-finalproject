package com.se465.ics;

public class Vcalendar
{
    private Vevent[] vevent;

    private String prodid;

    private String version;

    public Vevent[] getVevent ()
    {
        return vevent;
    }

    public void setVevent (Vevent[] vevent)
    {
        this.vevent = vevent;
    }

    public String getProdid ()
    {
        return prodid;
    }

    public void setProdid (String prodid)
    {
        this.prodid = prodid;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [vevent = "+vevent+", prodid = "+prodid+", version = "+version+"]";
    }
}