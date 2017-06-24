package com.pramod.paypal.model.dto;

/**
 * Created by Pramod.Shukla on 6/21/2017.
 */

public class PaypalDetails
{
    private String payerLastName;

    private String sellerProtectionStatus;

    private String imageUrl;

    private String paymentId;

    private String authorizationId;

    private String payerId;

    private String payerStatus;

    private String payerFirstName;

    private String debugId;

    private String payerEmail;

    public String getPayerLastName ()
    {
        return payerLastName;
    }

    public void setPayerLastName (String payerLastName)
    {
        this.payerLastName = payerLastName;
    }

    public String getSellerProtectionStatus ()
    {
        return sellerProtectionStatus;
    }

    public void setSellerProtectionStatus (String sellerProtectionStatus)
    {
        this.sellerProtectionStatus = sellerProtectionStatus;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getPaymentId ()
    {
        return paymentId;
    }

    public void setPaymentId (String paymentId)
    {
        this.paymentId = paymentId;
    }

    public String getAuthorizationId ()
    {
        return authorizationId;
    }

    public void setAuthorizationId (String authorizationId)
    {
        this.authorizationId = authorizationId;
    }

    public String getPayerId ()
    {
        return payerId;
    }

    public void setPayerId (String payerId)
    {
        this.payerId = payerId;
    }

    public String getPayerStatus ()
    {
        return payerStatus;
    }

    public void setPayerStatus (String payerStatus)
    {
        this.payerStatus = payerStatus;
    }

    public String getPayerFirstName ()
    {
        return payerFirstName;
    }

    public void setPayerFirstName (String payerFirstName)
    {
        this.payerFirstName = payerFirstName;
    }

    public String getDebugId ()
    {
        return debugId;
    }

    public void setDebugId (String debugId)
    {
        this.debugId = debugId;
    }

    public String getPayerEmail ()
    {
        return payerEmail;
    }

    public void setPayerEmail (String payerEmail)
    {
        this.payerEmail = payerEmail;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [payerLastName = "+payerLastName+", sellerProtectionStatus = "+sellerProtectionStatus+", imageUrl = "+imageUrl+", paymentId = "+paymentId+", authorizationId = "+authorizationId+", payerId = "+payerId+", payerStatus = "+payerStatus+", payerFirstName = "+payerFirstName+", debugId = "+debugId+", payerEmail = "+payerEmail+"]";
    }
}