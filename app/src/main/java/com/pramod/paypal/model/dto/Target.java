package com.pramod.paypal.model.dto;

/**
 * Created by Pramod.Shukla on 6/21/2017.
 */

public class Target
{
    private String processorSettlementResponseText;

    private descriptor descriptor;

    private PaypalDetails paypalDetails;

    private String processorResponseCode;

    private String avsStreetAddressResponseCode;

    private String merchantAccountId;

    private String type;

    private Customer customer;

    private String amount;

    private String id;

    private String[] disputes;

    private String paymentInstrumentType;

    private Subscription subscription;

    private CreatedAt createdAt;

    private String[] discounts;

    private shippingAddress shippingAddress;

    private String recurring;

    private String[] partialSettlementTransactionIds;

    private String orderId;

    private String taxExempt;

    private String[] refundIds;

    private String processorResponseText;

    private String processorSettlementResponseCode;

    private String cvvResponseCode;

    private String status;

    private customFields customFields;

    private String avsPostalCodeResponseCode;

    private StatusHistory[] statusHistory;

    private String[] addOns;

    private UpdatedAt updatedAt;

    private CreditCard creditCard;

    private String currencyIsoCode;

    private DisbursementDetails disbursementDetails;

    private billingAddress billingAddress;

    private String channel;

    public String getProcessorSettlementResponseText ()
    {
        return processorSettlementResponseText;
    }

    public void setProcessorSettlementResponseText (String processorSettlementResponseText)
    {
        this.processorSettlementResponseText = processorSettlementResponseText;
    }

    public descriptor getDescriptor ()
    {
        return descriptor;
    }

    public void setDescriptor (descriptor descriptor)
    {
        this.descriptor = descriptor;
    }

    public PaypalDetails getPaypalDetails ()
    {
        return paypalDetails;
    }

    public void setPaypalDetails (PaypalDetails paypalDetails)
    {
        this.paypalDetails = paypalDetails;
    }

    public String getProcessorResponseCode ()
    {
        return processorResponseCode;
    }

    public void setProcessorResponseCode (String processorResponseCode)
    {
        this.processorResponseCode = processorResponseCode;
    }

    public String getAvsStreetAddressResponseCode ()
    {
        return avsStreetAddressResponseCode;
    }

    public void setAvsStreetAddressResponseCode (String avsStreetAddressResponseCode)
    {
        this.avsStreetAddressResponseCode = avsStreetAddressResponseCode;
    }

    public String getMerchantAccountId ()
    {
        return merchantAccountId;
    }

    public void setMerchantAccountId (String merchantAccountId)
    {
        this.merchantAccountId = merchantAccountId;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public Customer getCustomer ()
    {
        return customer;
    }

    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String[] getDisputes ()
    {
        return disputes;
    }

    public void setDisputes (String[] disputes)
    {
        this.disputes = disputes;
    }

    public String getPaymentInstrumentType ()
    {
        return paymentInstrumentType;
    }

    public void setPaymentInstrumentType (String paymentInstrumentType)
    {
        this.paymentInstrumentType = paymentInstrumentType;
    }

    public Subscription getSubscription ()
    {
        return subscription;
    }

    public void setSubscription (Subscription subscription)
    {
        this.subscription = subscription;
    }

    public CreatedAt getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (CreatedAt createdAt)
    {
        this.createdAt = createdAt;
    }

    public String[] getDiscounts ()
    {
        return discounts;
    }

    public void setDiscounts (String[] discounts)
    {
        this.discounts = discounts;
    }

    public shippingAddress getShippingAddress ()
    {
        return shippingAddress;
    }

    public void setShippingAddress (shippingAddress shippingAddress)
    {
        this.shippingAddress = shippingAddress;
    }

    public String getRecurring ()
    {
        return recurring;
    }

    public void setRecurring (String recurring)
    {
        this.recurring = recurring;
    }

    public String[] getPartialSettlementTransactionIds ()
    {
        return partialSettlementTransactionIds;
    }

    public void setPartialSettlementTransactionIds (String[] partialSettlementTransactionIds)
    {
        this.partialSettlementTransactionIds = partialSettlementTransactionIds;
    }

    public String getOrderId ()
    {
        return orderId;
    }

    public void setOrderId (String orderId)
    {
        this.orderId = orderId;
    }

    public String getTaxExempt ()
    {
        return taxExempt;
    }

    public void setTaxExempt (String taxExempt)
    {
        this.taxExempt = taxExempt;
    }

    public String[] getRefundIds ()
    {
        return refundIds;
    }

    public void setRefundIds (String[] refundIds)
    {
        this.refundIds = refundIds;
    }

    public String getProcessorResponseText ()
    {
        return processorResponseText;
    }

    public void setProcessorResponseText (String processorResponseText)
    {
        this.processorResponseText = processorResponseText;
    }

    public String getProcessorSettlementResponseCode ()
    {
        return processorSettlementResponseCode;
    }

    public void setProcessorSettlementResponseCode (String processorSettlementResponseCode)
    {
        this.processorSettlementResponseCode = processorSettlementResponseCode;
    }

    public String getCvvResponseCode ()
    {
        return cvvResponseCode;
    }

    public void setCvvResponseCode (String cvvResponseCode)
    {
        this.cvvResponseCode = cvvResponseCode;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public customFields getCustomFields ()
    {
        return customFields;
    }

    public void setCustomFields (customFields customFields)
    {
        this.customFields = customFields;
    }

    public String getAvsPostalCodeResponseCode ()
    {
        return avsPostalCodeResponseCode;
    }

    public void setAvsPostalCodeResponseCode (String avsPostalCodeResponseCode)
    {
        this.avsPostalCodeResponseCode = avsPostalCodeResponseCode;
    }

    public StatusHistory[] getStatusHistory ()
    {
        return statusHistory;
    }

    public void setStatusHistory (StatusHistory[] statusHistory)
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

    public UpdatedAt getUpdatedAt ()
    {
        return updatedAt;
    }

    public void setUpdatedAt (UpdatedAt updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public CreditCard getCreditCard ()
    {
        return creditCard;
    }

    public void setCreditCard (CreditCard creditCard)
    {
        this.creditCard = creditCard;
    }

    public String getCurrencyIsoCode ()
    {
        return currencyIsoCode;
    }

    public void setCurrencyIsoCode (String currencyIsoCode)
    {
        this.currencyIsoCode = currencyIsoCode;
    }

    public DisbursementDetails getDisbursementDetails ()
    {
        return disbursementDetails;
    }

    public void setDisbursementDetails (DisbursementDetails disbursementDetails)
    {
        this.disbursementDetails = disbursementDetails;
    }

    public billingAddress getBillingAddress ()
    {
        return billingAddress;
    }

    public void setBillingAddress (billingAddress billingAddress)
    {
        this.billingAddress = billingAddress;
    }

    public String getChannel ()
    {
        return channel;
    }

    public void setChannel (String channel)
    {
        this.channel = channel;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [processorSettlementResponseText = "+processorSettlementResponseText+", descriptor = "+descriptor+", paypalDetails = "+paypalDetails+", processorResponseCode = "+processorResponseCode+", avsStreetAddressResponseCode = "+avsStreetAddressResponseCode+", merchantAccountId = "+merchantAccountId+", type = "+type+", customer = "+customer+", amount = "+amount+", id = "+id+", disputes = "+disputes+", paymentInstrumentType = "+paymentInstrumentType+", subscription = "+subscription+", createdAt = "+createdAt+", discounts = "+discounts+", shippingAddress = "+shippingAddress+", recurring = "+recurring+", partialSettlementTransactionIds = "+partialSettlementTransactionIds+", orderId = "+orderId+", taxExempt = "+taxExempt+", refundIds = "+refundIds+", processorResponseText = "+processorResponseText+", processorSettlementResponseCode = "+processorSettlementResponseCode+", cvvResponseCode = "+cvvResponseCode+", status = "+status+", customFields = "+customFields+", avsPostalCodeResponseCode = "+avsPostalCodeResponseCode+", statusHistory = "+statusHistory+", addOns = "+addOns+", updatedAt = "+updatedAt+", creditCard = "+creditCard+", currencyIsoCode = "+currencyIsoCode+", disbursementDetails = "+disbursementDetails+", billingAddress = "+billingAddress+", channel = "+channel+"]";
    }
}
