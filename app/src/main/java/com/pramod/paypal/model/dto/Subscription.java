package com.pramod.paypal.model.dto;

/**
 * Created by Pramod.Shukla on 6/21/2017.
 */

public class Subscription
{
    private String[] transactions;

    private String hasTrialPeriod;

    private String neverExpires;

    private String[] discounts;

    private String[] statusHistory;

    private String[] addOns;

    public String[] getTransactions ()
    {
        return transactions;
    }

    public void setTransactions (String[] transactions)
    {
        this.transactions = transactions;
    }

    public String getHasTrialPeriod ()
    {
        return hasTrialPeriod;
    }

    public void setHasTrialPeriod (String hasTrialPeriod)
    {
        this.hasTrialPeriod = hasTrialPeriod;
    }

    public String getNeverExpires ()
    {
        return neverExpires;
    }

    public void setNeverExpires (String neverExpires)
    {
        this.neverExpires = neverExpires;
    }

    public String[] getDiscounts ()
    {
        return discounts;
    }

    public void setDiscounts (String[] discounts)
    {
        this.discounts = discounts;
    }

    public String[] getStatusHistory ()
    {
        return statusHistory;
    }

    public void setStatusHistory (String[] statusHistory)
    {
        this.statusHistory = statusHistory;
    }

    public String[] getAddOns ()
    {
        return addOns;
    }

    public void setAddOns (String[] addOns)
    {
        this.addOns = addOns;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [transactions = "+transactions+", hasTrialPeriod = "+hasTrialPeriod+", neverExpires = "+neverExpires+", discounts = "+discounts+", statusHistory = "+statusHistory+", addOns = "+addOns+"]";
    }
}