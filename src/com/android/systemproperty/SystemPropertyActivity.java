package com.android.systemproperty;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class SystemPropertyActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textDevice = (TextView)findViewById(R.id.device);
        TextView textModel = (TextView)findViewById(R.id.model);
        TextView textProduct = (TextView)findViewById(R.id.product);
         
        TextView textCodename = (TextView)findViewById(R.id.codename);
        TextView textIncremental = (TextView)findViewById(R.id.incremental);
        TextView textRelease = (TextView)findViewById(R.id.release);
        TextView textSdk = (TextView)findViewById(R.id.sdk);
        TextView textSdkInt = (TextView)findViewById(R.id.sdk_int);
         
        TextView textOS_Arch = (TextView)findViewById(R.id.os_arch);
        TextView textOS_Name = (TextView)findViewById(R.id.os_name);
        TextView textOS_Version = (TextView)findViewById(R.id.os_version);
         
        textDevice.setText(".DEVICE: " + android.os.Build.DEVICE);
        textModel.setText(".MODEL: " + android.os.Build.MODEL);
        textProduct.setText(".PRODUCT: " + android.os.Build.PRODUCT);
         
        textCodename.setText(".CODENAME: " + android.os.Build.VERSION.CODENAME);
        textIncremental.setText(".INCREMENTAL: " + android.os.Build.VERSION.INCREMENTAL);
        textRelease.setText(".RELEASE: " + android.os.Build.VERSION.RELEASE);
        textSdk.setText(".SDK: " + android.os.Build.VERSION.SDK);
        textSdkInt.setText(".SDK_INT: " + String.valueOf(android.os.Build.VERSION.SDK_INT));
         
        textOS_Arch.setText("os.arch: " + System.getProperty("os.arch"));
        textOS_Name.setText("os.name: " + System.getProperty("os.name"));
        textOS_Version.setText("os.version: " + System.getProperty("os.version"));
    }
}