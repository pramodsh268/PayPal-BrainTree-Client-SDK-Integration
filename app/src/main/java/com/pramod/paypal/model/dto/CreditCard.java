package com.pramod.paypal.model.dto;

/**
 * Created by Pramod.Shukla on 6/21/2017.
 */

public class CreditCard
{
    private String prepaid;

    private String payroll;

    private String[] subscriptions;

    private String imageUrl;

    private String isVenmoSdk;

    private String productId;

    private String durbinRegulated;

    private String isExpired;

    private String isDefault;

    private String issuingBank;

    private String expirationMonth;

    private String expirationYear;

    private String countryOfIssuance;

    private String debit;

    private String commercial;

    private String healthcare;

    public String getPrepaid ()
    {
        return prepaid;
    }

    public void setPrepaid (String prepaid)
    {
        this.prepaid = prepaid;
    }

    public String getPayroll ()
    {
        return payroll;
    }

    public void setPayroll (String payroll)
    {
        this.payroll = payroll;
    }

    public String[] getSubscriptions ()
    {
        return subscriptions;
    }

    public void setSubscriptions (String[] subscriptions)
    {
        this.subscriptions = subscriptions;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getIsVenmoSdk ()
    {
        return isVenmoSdk;
    }

    public void setIsVenmoSdk (String isVenmoSdk)
    {
        this.isVenmoSdk = isVenmoSdk;
    }

    public String getProductId ()
    {
        return productId;
    }

    public void setProductId (String productId)
    {
        this.productId = productId;
    }

    public String getDurbinRegulated ()
    {
        return durbinRegulated;
    }

    public void setDurbinRegulated (String durbinRegulated)
    {
        this.durbinRegulated = durbinRegulated;
    }

    public String getIsExpired ()
    {
        return isExpired;
    }

    public void setIsExpired (String isExpired)
    {
        this.isExpired = isExpired;
    }

    public String getIsDefault ()
    {
        return isDefault;
    }

    public void setIsDefault (String isDefault)
    {
        this.isDefault = isDefault;
    }

    public String getIssuingBank ()
    {
        return issuingBank;
    }

    public void setIssuingBank (String issuingBank)
    {
        this.issuingBank = issuingBank;
    }

    public String getExpirationMonth ()
    {
        return expirationMonth;
    }

    public void setExpirationMonth (String expirationMonth)
    {
        this.expirationMonth = expirationMonth;
    }

    public String getExpirationYear ()
    {
        return expirationYear;
    }

    public void setExpirationYear (String expirationYear)
    {
        this.expirationYear = expirationYear;
    }

    public String getCountryOfIssuance ()
    {
        return countryOfIssuance;
    }

    public void setCountryOfIssuance (String countryOfIssuance)
    {
        this.countryOfIssuance = countryOfIssuance;
    }

    public String getDebit ()
    {
        return debit;
    }

    public void setDebit (String debit)
    {
        this.debit = debit;
    }

    public String getCommercial ()
    {
        return commercial;
    }

    public void setCommercial (String commercial)
    {
        this.commercial = commercial;
    }

    public String getHealthcare ()
    {
        return healthcare;
    }

    public void setHealthcare (String healthcare)
    {
        this.healthcare = healthcare;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [prepaid = "+prepaid+", payroll = "+payroll+", subscriptions = "+subscriptions+", imageUrl = "+imageUrl+", isVenmoSdk = "+isVenmoSdk+", productId = "+productId+", durbinRegulated = "+durbinRegulated+", isExpired = "+isExpired+", isDefault = "+isDefault+", issuingBank = "+issuingBank+", expirationMonth = "+expirationMonth+", expirationYear = "+expirationYear+", countryOfIssuance = "+countryOfIssuance+", debit = "+debit+", commercial = "+commercial+", healthcare = "+healthcare+"]";
    }
}