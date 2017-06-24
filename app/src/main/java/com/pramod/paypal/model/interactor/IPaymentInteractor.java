package com.pramod.paypal.model.interactor;

import com.pramod.paypal.model.dto.CheckoutRequest;
import com.pramod.paypal.presenter.PaymentServiceListener;

/**
 * Created by pramod on 24/6/17.
 */

public interface IPaymentInteractor {
    void getClientToken(PaymentServiceListener paymentServiceListener);
    void processExpressCheckout(CheckoutRequest checkoutRequest,PaymentServiceListener paymentServiceListener);
}
