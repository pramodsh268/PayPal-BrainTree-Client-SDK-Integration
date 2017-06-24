package com.pramod.paypal.model.interactor;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.pramod.paypal.model.api.APIClient;
import com.pramod.paypal.model.api.APIService;
import com.pramod.paypal.model.dto.CheckoutRequest;
import com.pramod.paypal.model.dto.ClientTokenResponse;
import com.pramod.paypal.model.dto.Target;
import com.pramod.paypal.model.dto.TransactionResponse;
import com.pramod.paypal.presenter.PaymentServiceListener;
import com.pramod.paypal.view.PaymentDashboard;
import com.pramod.paypal.view.PaymentDetailsActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pramod on 24/6/17.
 */

public class PaymentInteractor implements IPaymentInteractor{

    private PaymentServiceListener serviceListener;

    public void PaymentInteractor()
    {}


    @Override
    public void getClientToken(PaymentServiceListener paymentServiceListener) {

        APIService api= APIClient.get();
        this.serviceListener=paymentServiceListener;
        Call<ClientTokenResponse> tokenResponseCall=api.getClientToken();
        tokenResponseCall.enqueue(new Callback<ClientTokenResponse>() {
            @Override
            public void onResponse(Call<ClientTokenResponse> call, Response<ClientTokenResponse> response) {

                Log.d("ONRESPONSE  ","This is client token "+response.body().getToken());
                serviceListener.onSuccess(response.body());

            }

            @Override
            public void onFailure(Call<ClientTokenResponse> call, Throwable t) {

                Log.d("onFailure ","Error  "+t.getMessage().toString());
                serviceListener.onFailure(t);
            }
        });


    }

    @Override
    public void processExpressCheckout(CheckoutRequest checkoutRequest,PaymentServiceListener paymentServiceListener) {

        APIService api= APIClient.get();
        this.serviceListener=paymentServiceListener;
        Call<TransactionResponse>checkoutAPI=api.expressCheckout(checkoutRequest);

        checkoutAPI.enqueue(new Callback<TransactionResponse>() {
            @Override
            public void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {

                Log.d("ONRESPONSE  ","This is client token "+response);
                serviceListener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<TransactionResponse> call, Throwable t) {


                Log.d("onFailure ","Error  "+t.getMessage().toString());
                serviceListener.onFailure(t);
            }
        });

    }
}
