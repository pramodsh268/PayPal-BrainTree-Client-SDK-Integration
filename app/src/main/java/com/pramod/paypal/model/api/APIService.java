package com.pramod.paypal.model.api;

import com.pramod.paypal.model.dto.CheckoutRequest;
import com.pramod.paypal.model.dto.ClientTokenResponse;
import com.pramod.paypal.model.dto.TransactionResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Pramod.Shukla on 6/19/2017.
 */

public interface APIService {

    @GET("client/token")
    Call<ClientTokenResponse> getClientToken();

//    @GET("client/payment/")
//    Call<TransactionResponse>makeExpreseCheckOut(@Query("amount") String amount, @Query("nonce")String nonce);

    @POST("client/checkout")
    Call<TransactionResponse>expressCheckout(@Body CheckoutRequest checkoutRequest);

}
