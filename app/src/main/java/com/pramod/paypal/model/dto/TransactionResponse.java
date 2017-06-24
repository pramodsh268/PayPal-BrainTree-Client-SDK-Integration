package com.pramod.paypal.model.dto;

/**
 * Created by Pramod.Shukla on 6/21/2017.
 */

public class TransactionResponse {

    private Target target;

    public Target getTarget ()
    {
        return target;
    }

    public void setTarget (Target target)
    {
        this.target = target;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [target = "+target+"]";
    }
}
