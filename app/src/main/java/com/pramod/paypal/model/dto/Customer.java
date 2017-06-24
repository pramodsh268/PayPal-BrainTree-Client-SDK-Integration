package com.pramod.paypal.model.dto;

/**
 * Created by Pramod.Shukla on 6/21/2017.
 */

public class Customer
{
    private String[] applePayCards;

    private customFields customFields;

    private String[] usBankAccounts;

    private String[] visaCheckoutCards;

    private String[] androidPayCards;

    private String[] masterpassCards;

    private String[] venmoAccounts;

    private String[] addresses;

    private String[] amexExpressCheckoutCards;

    private String[] paypalAccounts;

    private String[] coinbaseAccounts;

    private String[] creditCards;

    public String[] getApplePayCards ()
    {
        return applePayCards;
    }

    public void setApplePayCards (String[] applePayCards)
    {
        this.applePayCards = applePayCards;
    }

    public customFields getCustomFields ()
    {
        return customFields;
    }

    public void setCustomFields (customFields customFields)
    {
        this.customFields = customFields;
    }

    public String[] getUsBankAccounts ()
    {
        return usBankAccounts;
    }

    public void setUsBankAccounts (String[] usBankAccounts)
    {
        this.usBankAccounts = usBankAccounts;
    }

    public String[] getVisaCheckoutCards ()
    {
        return visaCheckoutCards;
    }

    public void setVisaCheckoutCards (String[] visaCheckoutCards)
    {
        this.visaCheckoutCards = visaCheckoutCards;
    }

    public String[] getAndroidPayCards ()
    {
        return androidPayCards;
    }

    public void setAndroidPayCards (String[] androidPayCards)
    {
        this.androidPayCards = androidPayCards;
    }

    public String[] getMasterpassCards ()
    {
        return masterpassCards;
    }

    public void setMasterpassCards (String[] masterpassCards)
    {
        this.masterpassCards = masterpassCards;
    }

    public String[] getVenmoAccounts ()
    {
        return venmoAccounts;
    }

    public void setVenmoAccounts (String[] venmoAccounts)
    {
        this.venmoAccounts = venmoAccounts;
    }

    public String[] getAddresses ()
    {
        return addresses;
    }

    public void setAddresses (String[] addresses)
    {
        this.addresses = addresses;
    }

    public String[] getAmexExpressCheckoutCards ()
    {
        return amexExpressCheckoutCards;
    }

    public void setAmexExpressCheckoutCards (String[] amexExpressCheckoutCards)
    {
        this.amexExpressCheckoutCards = amexExpressCheckoutCards;
    }

    public String[] getPaypalAccounts ()
    {
        return paypalAccounts;
    }

    public void setPaypalAccounts (String[] paypalAccounts)
    {
        this.paypalAccounts = paypalAccounts;
    }

    public String[] getCoinbaseAccounts ()
    {
        return coinbaseAccounts;
    }

    public void setCoinbaseAccounts (String[] coinbaseAccounts)
    {
        this.coinbaseAccounts = coinbaseAccounts;
    }

    public String[] getCreditCards ()
    {
        return creditCards;
    }

    public void setCreditCards (String[] creditCards)
    {
        this.creditCards = creditCards;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [applePayCards = "+applePayCards+", customFields = "+customFields+", usBankAccounts = "+usBankAccounts+", visaCheckoutCards = "+visaCheckoutCards+", androidPayCards = "+androidPayCards+", masterpassCards = "+masterpassCards+", venmoAccounts = "+venmoAccounts+", addresses = "+addresses+", amexExpressCheckoutCards = "+amexExpressCheckoutCards+", paypalAccounts = "+paypalAccounts+", coinbaseAccounts = "+coinbaseAccounts+", creditCards = "+creditCards+"]";
    }
}
