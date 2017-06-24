package com.pramod.paypal.presenter;

import com.pramod.paypal.model.dto.CheckoutRequest;
import com.pramod.paypal.view.IPaymentDashboard;

/**
 * Created by pramod on 24/6/17.
 */

public interface IPaymentPresentor {
    void getClientToken(IPaymentDashboard iPaymentDashboard);
    void processExpressCheckout(CheckoutRequest checkoutRequest,IPaymentDashboard iPaymentDashboard);

}
