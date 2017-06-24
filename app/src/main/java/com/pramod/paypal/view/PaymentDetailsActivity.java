package com.pramod.paypal.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.pramod.paypal.R;
import com.pramod.paypal.model.dto.Target;

public class PaymentDetailsActivity extends AppCompatActivity {


    private TextView  transactionId,debugId,sellerStatus,orderId,paymentId,payerId,payerEmail
            ,payerFirstName,payerLastName,payerStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paypal_detail_activity);

        transactionId=(TextView)findViewById(R.id.tv_trans_id);
        debugId=(TextView)findViewById(R.id.tv_debug_id);
        sellerStatus=(TextView)findViewById(R.id.tv_seller_eligi);
        orderId=(TextView)findViewById(R.id.tv_orderId);
        paymentId=(TextView)findViewById(R.id.tv_pmtId);
        payerId=(TextView)findViewById(R.id.tv_payerId);
        payerEmail=(TextView)findViewById(R.id.tv_payer_email);
        payerFirstName=(TextView)findViewById(R.id.tv_payer_fname);
        payerLastName=(TextView)findViewById(R.id.tv_payer_sname);
        payerStatus=(TextView)findViewById(R.id.tv_status);

        Gson comp_gson = new Gson();
        String input=getIntent().getStringExtra("transaction_details");
        Target transReponse= comp_gson.fromJson(input, Target.class);

        if(transReponse!=null)
        {
            if(transReponse.getPaypalDetails()!=null)
            {
                if(transReponse.getPaypalDetails().getAuthorizationId()!=null)
                {
                    transactionId.setText(transReponse.getPaypalDetails().getAuthorizationId());
                }
                if(transReponse.getPaypalDetails().getDebugId()!=null)
                {
                    debugId.setText(transReponse.getPaypalDetails().getDebugId());
                }
                if(transReponse.getPaypalDetails().getSellerProtectionStatus()!=null)
                {
                    sellerStatus.setText(transReponse.getPaypalDetails().getSellerProtectionStatus());
                }
                if(PaymentDashboard.generatedOrderId!=null)
                {
                    orderId.setText(PaymentDashboard.generatedOrderId);
                }
                if(transReponse.getPaypalDetails().getPaymentId()!=null)
                {
                    paymentId.setText(transReponse.getPaypalDetails().getPaymentId());
                }


                if(transReponse.getPaypalDetails().getPayerId()!=null)
                {
                    payerId.setText(transReponse.getPaypalDetails().getPayerId());
                }
                if(transReponse.getPaypalDetails().getPayerEmail()!=null)
                {
                    payerEmail.setText(transReponse.getPaypalDetails().getPayerEmail());
                }
                if(transReponse.getPaypalDetails().getPayerFirstName()!=null)
                {
                    payerFirstName.setText(transReponse.getPaypalDetails().getPayerFirstName());
                }
                if(transReponse.getPaypalDetails().getPayerLastName()!=null)
                {
                    payerLastName.setText(transReponse.getPaypalDetails().getPayerLastName());
                }
                if(transReponse.getPaypalDetails().getPayerStatus()!=null)
                {
                    payerStatus.setText(transReponse.getPaypalDetails().getPayerStatus());
                }
            }


        }




    }

}
