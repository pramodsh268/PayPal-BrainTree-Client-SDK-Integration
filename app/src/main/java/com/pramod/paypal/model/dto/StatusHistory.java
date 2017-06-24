package com.pramod.paypal.model.dto;

/**
 * Created by Pramod.Shukla on 6/21/2017.
 */

public class StatusHistory
{
    private Timestamp timestamp;

    private String amount;

    private String source;

    private String status;

    public Timestamp getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (Timestamp timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getSource ()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
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
        return "ClassPojo [timestamp = "+timestamp+", amount = "+amount+", source = "+source+", status = "+status+"]";
    }
}

