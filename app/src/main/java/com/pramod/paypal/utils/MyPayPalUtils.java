package com.pramod.paypal.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.Random;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Pramod.Shukla on 5/16/2017.
 */

public class MyPayPalUtils {
    public static String getRandomString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static String makeRequest_https(String strURL, String body) {
        java.net.URL url = null;
        HttpsURLConnection urlConnection = null;
        try {
            url = new URL(strURL);
            StringBuilder sb = new StringBuilder();
            urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("Content-Type", "application/xml");
           /* if (api_key.length() > 0)
                urlConnection.setRequestProperty("X-API-Key", api_key);
*/
            urlConnection.connect();
            OutputStream os = new BufferedOutputStream(
                    urlConnection.getOutputStream());
            os.write(body.getBytes());
            os.flush();

            int HttpResult = urlConnection.getResponseCode();
            if (HttpResult == HttpsURLConnection.HTTP_OK) {
                System.out.println("ok");
                Log.v("Hi", "" + "Trex");
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        urlConnection.getInputStream(), "utf-8"));
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();
                Log.e("rep", sb.toString());

            } else {
                Log.e("rep", urlConnection.getResponseMessage());
            }
            return sb.toString();
        } catch (IOException e1) {
            return "server_error " + e1.toString();
        } catch (Exception e) {
            return "server_error " + e.toString();
        }
    }

    public static String getXMLText(String inxml, String tag) {
        String outstr = "";
        if (inxml.contains("<" + tag + ">") && inxml.contains("</" + tag + ">")) {
            outstr = inxml.substring(inxml.indexOf("<" + tag + ">") + (tag.length() + 2), inxml.indexOf("</" + tag + ">"));

        }
        return outstr;
    }


    public static void hideKyboard(Activity mActivity, View v) {
        View view;
        // Check if no view has focus:
        if (v == null) {
            view = mActivity.getCurrentFocus();
        } else {

            view = v;
        }
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) mActivity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

    }

}
