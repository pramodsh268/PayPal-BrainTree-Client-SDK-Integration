package com.pramod.paypal.model.dto;

/**
 * Created by Pramod.Shukla on 6/21/2017.
 */

public class DisbursementDetails
{
    private String fundsHeld;

    private String success;

    public String getFundsHeld ()
    {
        return fundsHeld;
    }

    public void setFundsHeld (String fundsHeld)
    {
        this.fundsHeld = fundsHeld;
    }

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [fundsHeld = "+fundsHeld+", success = "+success+"]";
    }
}

