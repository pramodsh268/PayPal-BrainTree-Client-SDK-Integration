package com.pramod.paypal.presenter;

/**
 * Created by pramod on 24/6/17.
 */

public interface PaymentServiceListener {
    void onSuccess(Object response);
    void onFailure(Object response);
}
