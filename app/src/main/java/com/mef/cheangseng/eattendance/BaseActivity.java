package com.mef.cheangseng.eattendance;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;

import com.mef.cheangseng.eattendance.utils.CustomProgressDialog;

import java.io.ByteArrayOutputStream;

public class BaseActivity extends AppCompatActivity {

    public CustomProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void showProgressDialog(String message){
        if(progressDialog == null)
            progressDialog = new CustomProgressDialog(this);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
    }

    public void dismissProgressDialog(){
        if(progressDialog != null)
            if(progressDialog.isShowing())
                progressDialog.dismiss();
    }


    public static String getImageBase64(String uri){

        Bitmap bm = BitmapFactory.decodeFile(uri);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.JPEG, 75, baos); //bm is the bitmap object
        byte[] b = baos.toByteArray();
        //Log.d("base64",encodedImage);
        return Base64.encodeToString(b, Base64.DEFAULT);
    }
    public static boolean isNetworkAvailable(Context context) {

        ConnectivityManager manager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();

        boolean isAvailable = false;
        if (networkInfo != null && networkInfo.isConnected()) {
            isAvailable = true;

        }
        return isAvailable;
    }



}
