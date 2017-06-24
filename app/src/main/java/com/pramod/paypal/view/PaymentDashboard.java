package com.pramod.paypal.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.braintreepayments.api.BraintreeFragment;
import com.braintreepayments.api.PayPal;
import com.braintreepayments.api.exceptions.BraintreeError;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.interfaces.BraintreeCancelListener;
import com.braintreepayments.api.interfaces.BraintreeErrorListener;
import com.braintreepayments.api.interfaces.ConfigurationListener;
import com.braintreepayments.api.interfaces.PaymentMethodNonceCreatedListener;
import com.braintreepayments.api.models.Configuration;
import com.braintreepayments.api.models.PayPalRequest;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.braintreepayments.api.models.PostalAddress;
import com.google.gson.Gson;
import com.pramod.paypal.R;
import com.pramod.paypal.model.api.APIClient;
import com.pramod.paypal.model.api.APIService;
import com.pramod.paypal.model.dto.CheckoutRequest;
import com.pramod.paypal.model.dto.ClientTokenResponse;
import com.pramod.paypal.model.dto.Target;
import com.pramod.paypal.model.dto.TransactionResponse;
import com.pramod.paypal.presenter.PaymentPresentor;
import com.pramod.paypal.utils.MyPayPalUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PaymentDashboard extends AppCompatActivity implements
        IPaymentDashboard,PaymentMethodNonceCreatedListener,ConfigurationListener,BraintreeErrorListener,BraintreeCancelListener {

    private APIService api;
    private ProgressDialog showLoading;

    public static String generatedOrderId;
    private EditText et_amount,et_currency,et_orderId,et_phone_number,et_postal,et_state,
            et_country,et_city,et_address_line2,et_address_line1,et_order_desc;
    private String message=null;

    private String CLIENT_TOKEN=null;
    private PaymentPresentor paymentPresentor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pramod_paypal_payment_dashboard);


        defineScreenElements();

        generatedOrderId=MyPayPalUtils.getRandomString();


        paymentPresentor= new PaymentPresentor();

        et_orderId.setText(generatedOrderId);

        Button submit_btn= (Button)findViewById(R.id.btn_submit);
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPayment();
            }
        });

        createProgressBar();

        getToken();

    }

    private void defineScreenElements()
    {
        et_amount=(EditText)findViewById(R.id.et_amt);
        et_currency=(EditText)findViewById(R.id.et_currency);
        et_orderId=(EditText)findViewById(R.id.et_order_id);

        et_phone_number=(EditText)findViewById(R.id.et_phone_number);
        et_postal=(EditText)findViewById(R.id.et_postal);
        et_state=(EditText)findViewById(R.id.et_state);
        et_country=(EditText)findViewById(R.id.et_country);
        et_city=(EditText)findViewById(R.id.et_city);
        et_address_line2=(EditText)findViewById(R.id.et_address_line2);
        et_address_line1=(EditText)findViewById(R.id.et_address_line1);
        et_order_desc=(EditText)findViewById(R.id.et_order_desc);

    }

    private void getToken()
    {
        message="Fetching authentication token...";
        showLoading.setMessage(message);
        showLoading.show();

        paymentPresentor.getClientToken(this);

    }

    private void createProgressBar() {
        showLoading = new ProgressDialog(this);
        showLoading.setCancelable(false);
        showLoading.setMessage(message);
        showLoading.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    }

    void startPayment()
    {

        if(et_amount.getText().toString().length()>0){

            try{
                getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); //Hiding the keyboard
                BraintreeFragment mBraintreeFragment = BraintreeFragment.newInstance(this, CLIENT_TOKEN);

                PayPalRequest request = new PayPalRequest(et_amount.getText().toString());
                request.currencyCode(et_currency.getText().toString());
                request.billingAgreementDescription(et_order_desc.getText().toString());
                request.displayName("Paypal Braintree Integration");
                PostalAddress postalAddress= new PostalAddress();
                postalAddress.countryCodeAlpha2(et_country.getText().toString());
                postalAddress.locality(et_city.toString());
                postalAddress.extendedAddress(et_address_line2.getText().toString());
                postalAddress.postalCode(et_postal.getText().toString());
                postalAddress.region(et_state.getText().toString());
                postalAddress.streetAddress(et_address_line1.getText().toString());
//          request.shippingAddressOverride(postalAddress); ///Commented this line as paypal page was not launching after adding this line...

                PayPal.requestOneTimePayment(mBraintreeFragment, request);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }else
        {
            Toast.makeText(PaymentDashboard.this,"Please enter amount",Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public void onPaymentMethodNonceCreated(PaymentMethodNonce paymentMethodNonce) {
        Log.d("PAYMENT_METHOD","Payment   "+paymentMethodNonce.getNonce().toString());

        CheckoutRequest checkoutRequest= new CheckoutRequest();
        checkoutRequest.setAmount(et_amount.getText().toString());
        checkoutRequest.setCurrency(et_currency.getText().toString());
        checkoutRequest.setPayment_nonce(paymentMethodNonce.getNonce().toString());

        checkoutRequest.setAddress1(et_address_line1.getText().toString());
        checkoutRequest.setAddress2(et_address_line2.getText().toString());
        checkoutRequest.setCity(et_city.getText().toString());
        checkoutRequest.setState(et_state.getText().toString());
        checkoutRequest.setCountry(et_country.getText().toString());
        checkoutRequest.setOrderDescription(et_order_desc.getText().toString());
        checkoutRequest.setPostal_code(et_postal.getText().toString());
        checkoutRequest.setPhone_no(et_phone_number.getText().toString());


        message="Authorizing transaction...";
        showLoading.setMessage(message);

        showLoading.show();

        paymentPresentor.processExpressCheckout(checkoutRequest,this);

    }

    @Override
    public void onError(Exception error) {

        if (error instanceof ErrorWithResponse) {
            ErrorWithResponse errorWithResponse = (ErrorWithResponse) error;
            BraintreeError cardErrors = ((ErrorWithResponse) error).errorFor("creditCard");
            if (cardErrors != null) {
                // There is an issue with the credit card.
                BraintreeError expirationMonthError = cardErrors.errorFor("expirationMonth");
                if (expirationMonthError != null) {
                    // There is an issue with the expiration month.
                    Log.d("onError","expirationMonthError   "+expirationMonthError.getMessage());
                }
            }
        }
    }

    @Override
    public void onConfigurationFetched(Configuration configuration) {
        Log.d("onConfigurationFetched","configuration  "+configuration.toString());
    }

    @Override
    public void onCancel(int requestCode) {
        Log.d("onCancel","requestCode   "+requestCode);
    }

    @Override
    public void onSuccess(Object object) {

        showLoading.dismiss();
        if(object instanceof ClientTokenResponse)
        {
            ClientTokenResponse clientTokenResponse=(ClientTokenResponse)object;
            CLIENT_TOKEN=clientTokenResponse.getToken();

        }else
        {
            TransactionResponse response=(TransactionResponse)object;
            if(response.getTarget()!=null)
            {
                if(response.getTarget().getStatus().equalsIgnoreCase("authorized"))
                {
                    Intent i= new Intent(PaymentDashboard.this, PaymentDetailsActivity.class);
                    Target transResponse=response.getTarget();
                    i.putExtra("transaction_details",new Gson().toJson(transResponse));
                    startActivity(i);
                    Toast.makeText(PaymentDashboard.this,"Payment authorized successfully",Toast.LENGTH_SHORT).show();
                }
            }else
            {
                Toast.makeText(PaymentDashboard.this,"Payment authorization failed",Toast.LENGTH_SHORT).show();
            }


        }
    }

    @Override
    public void onFailure(Object object) {

        showLoading.dismiss();
        Throwable failure=(Throwable)object;
        Toast.makeText(PaymentDashboard.this,"Error occured "+failure.getMessage().toString(),Toast.LENGTH_SHORT).show();
    }
}
