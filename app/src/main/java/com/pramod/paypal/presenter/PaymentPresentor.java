package com.pramod.paypal.presenter;

import com.pramod.paypal.model.api.APIClient;
import com.pramod.paypal.model.api.APIService;
import com.pramod.paypal.model.dto.CheckoutRequest;
import com.pramod.paypal.model.interactor.PaymentInteractor;
import com.pramod.paypal.view.IPaymentDashboard;

/**
 * Created by pramod on 24/6/17.
 */

public class PaymentPresentor  implements PaymentServiceListener,IPaymentPresentor{

    private IPaymentDashboard paymentDashboardView;
    private PaymentInteractor paymentInteractor;
    public void PaymentPresentor()
    {



    }
    @Override
    public void getClientToken(IPaymentDashboard iPaymentDashboard) {

        this.paymentDashboardView=iPaymentDashboard;
        this.paymentInteractor=new PaymentInteractor();
        this.paymentInteractor.getClientToken(this);

    }

    @Override
    public void processExpressCheckout(CheckoutRequest checkoutRequest,IPaymentDashboard iPaymentDashboard) {

        this.paymentDashboardView=iPaymentDashboard;
        this.paymentInteractor=new PaymentInteractor();
        this.paymentInteractor.processExpressCheckout(checkoutRequest,this);

    }

    @Override
    public void onSuccess(Object response) {
        this.paymentDashboardView.onSuccess(response);

    }

    @Override
    public void onFailure(Object response) {

        this.paymentDashboardView.onFailure(response);

    }
}
