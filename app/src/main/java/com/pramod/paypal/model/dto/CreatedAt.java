package com.pramod.paypal.model.dto;

/**
 * Created by Pramod.Shukla on 6/21/2017.
 */

public class CreatedAt
{
    private String minute;

    private String second;

    private String dayOfMonth;

    private String month;

    private String year;

    private String hourOfDay;

    public String getMinute ()
    {
        return minute;
    }

    public void setMinute (String minute)
    {
        this.minute = minute;
    }

    public String getSecond ()
    {
        return second;
    }

    public void setSecond (String second)
    {
        this.second = second;
    }

    public String getDayOfMonth ()
    {
        return dayOfMonth;
    }

    public void setDayOfMonth (String dayOfMonth)
    {
        this.dayOfMonth = dayOfMonth;
    }

    public String getMonth ()
    {
        return month;
    }

    public void setMonth (String month)
    {
        this.month = month;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    public String getHourOfDay ()
    {
        return hourOfDay;
    }

    public void setHourOfDay (String hourOfDay)
    {
        this.hourOfDay = hourOfDay;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [minute = "+minute+", second = "+second+", dayOfMonth = "+dayOfMonth+", month = "+month+", year = "+year+", hourOfDay = "+hourOfDay+"]";
    }
}
