package com.example.androidapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    Button btnDangnhap;
    BroadcastReceiver wifiReceiver=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager manager=(ConnectivityManager)context.getSystemService(CONNECTIVITY_SERVICE);
            if(manager.getActiveNetwork()!=null)
                btnDangnhap.setEnabled(true);
            else
                btnDangnhap.setEnabled(false);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnDangnhap=findViewById(R.id.btnDangnhap);

    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter=new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(wifiReceiver,filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(wifiReceiver!=null)
            unregisterReceiver(wifiReceiver);
    }
}
