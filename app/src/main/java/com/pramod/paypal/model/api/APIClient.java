package com.pramod.paypal.model.api;

import com.pramod.paypal.constants.AppConstants;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pramod.Shukla on 6/19/2017.
 */

public class APIClient
{
    private static Retrofit.Builder builder;

    private static Retrofit retrofit;

    private static APIService REST_CLIENT;


    static
    {
        setupRestClient();
    }

    private APIClient()
    {
    }

    public static Retrofit.Builder getBuilder()
    {
        return builder;
    }

    public static void setBuilder(Retrofit.Builder builder)
    {
        APIClient.builder = builder;
    }

    public static Retrofit getRetrofit()
    {
        return retrofit;
    }

    public static void setRetrofit(Retrofit retrofit)
    {
        APIClient.retrofit = retrofit;
    }

    public static APIService get()
    {
        return REST_CLIENT;
    }


    public static void setupRestClient()
    {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        /**
         * Configured OkHttp Client To Authenticate
         */
        final OkHttpClient client = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        GsonConverterFactory gsonConverterFactory= GsonConverterFactory.create();
            ////For APIs developed by GSP and ASP team/////
        builder = new Retrofit.Builder().baseUrl(AppConstants.BASE_URL).client(client).addConverterFactory(GsonConverterFactory.create());

        retrofit = builder.build();
        REST_CLIENT = retrofit.create(APIService.class);
    }
}
