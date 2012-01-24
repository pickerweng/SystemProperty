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
        
        TextView textBoard = (TextView) findViewById(R.id.board);
        TextView textBootloader = (TextView) findViewById(R.id.bootloader);
        TextView textBrand = (TextView) findViewById(R.id.brand);
        TextView textCpuAbi = (TextView) findViewById(R.id.cpu_abi);
        TextView textCpuAbi2 = (TextView) findViewById(R.id.cpu_abi2);
        
        TextView textDevice = (TextView) findViewById(R.id.device);
        TextView textDisplay = (TextView) findViewById(R.id.display);
        TextView textFingerprint = (TextView) findViewById(R.id.fingerprint);
        TextView textHardware = (TextView) findViewById(R.id.hardware);
        TextView textHost = (TextView) findViewById(R.id.host);
        TextView textId = (TextView) findViewById(R.id.id);
        TextView textManufacturer = (TextView) findViewById(R.id.manufacturer);
        
        TextView textModel = (TextView) findViewById(R.id.model);
        TextView textProduct = (TextView) findViewById(R.id.product);
        
        TextView textRadio = (TextView) findViewById(R.id.radio);
        TextView textSerial = (TextView) findViewById(R.id.serial);
        TextView textTags = (TextView) findViewById(R.id.tags);
        TextView textTime = (TextView) findViewById(R.id.time);
        TextView textType = (TextView) findViewById(R.id.type);
        TextView textUser = (TextView) findViewById(R.id.user);
         
        TextView textCodename = (TextView) findViewById(R.id.codename);
        TextView textIncremental = (TextView) findViewById(R.id.incremental);
        TextView textRelease = (TextView) findViewById(R.id.release);
        TextView textSdk = (TextView) findViewById(R.id.sdk);
        TextView textSdkInt = (TextView) findViewById(R.id.sdk_int);
         
        TextView textOS_Arch = (TextView) findViewById(R.id.os_arch);
        TextView textOS_Name = (TextView) findViewById(R.id.os_name);
        TextView textOS_Version = (TextView) findViewById(R.id.os_version);
        
        textBoard.setText(".BOARD: " + android.os.Build.BOARD);
        textBootloader.setText(".BOOTLOADER: " + android.os.Build.BOOTLOADER);
        textBrand.setText(".BRAND: " + android.os.Build.BRAND);
        textCpuAbi.setText(".CPU_ABI: " + android.os.Build.CPU_ABI);
        textCpuAbi2.setText(".CPU_ABI2: " + android.os.Build.CPU_ABI2);
        
        textDevice.setText(".DEVICE: " + android.os.Build.DEVICE);
        textDisplay.setText(".DISPLAY: " + android.os.Build.DISPLAY);
        textFingerprint.setText(".FINGERPRINT: " + android.os.Build.FINGERPRINT);
        textHardware.setText(".HARDWARE: " + android.os.Build.HARDWARE);
        textHost.setText(".HOST: " + android.os.Build.HOST);
        textId.setText(".ID: " + android.os.Build.ID);
        textManufacturer.setText(".MANUFACTURER: " + android.os.Build.MANUFACTURER);
        
        textModel.setText(".MODEL: " + android.os.Build.MODEL);
        textProduct.setText(".PRODUCT: " + android.os.Build.PRODUCT);
        
        textRadio.setText(".RADIO: " + android.os.Build.RADIO);
        textSerial.setText(".SERIAL: " + android.os.Build.SERIAL);
        textTags.setText(".TAGS: " + android.os.Build.TAGS);
        textTime.setText(".TIME: " + android.os.Build.TIME);
        textType.setText(".TYPE: " + android.os.Build.TYPE);
        textUser.setText(".USER: " + android.os.Build.USER);
         
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