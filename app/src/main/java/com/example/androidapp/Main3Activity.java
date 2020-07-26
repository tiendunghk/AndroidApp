package com.example.androidapp;

import android.app.NotificationManager;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;

public class Main3Activity extends AppCompatActivity {

    NotificationCompat.Builder mBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void clickMo(View view) {

        mBuilder = new NotificationCompat.Builder(this).setSmallIcon(R.drawable.icons8_alarm_16)
                .setContentTitle("new noti")
                .setContentText("notihuyghjgvbhj");
        Uri sound=Uri.parse("android.resource"+"://"+getPackageName()+"/"+R.raw.swiftly);
        mBuilder.setSound(sound);

        NotificationManager notificationManager =(NotificationManager)view.getContext().getSystemService(NOTIFICATION_SERVICE);

        notificationManager.notify(0,mBuilder.build());





    }

    public void clickDong(View view) {
        NotificationManager notificationManager =(NotificationManager)view.getContext().getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(0);
    }
}
