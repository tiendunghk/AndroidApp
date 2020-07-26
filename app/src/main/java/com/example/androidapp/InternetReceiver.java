package com.example.androidapp;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;

import static android.content.Context.CONNECTIVITY_SERVICE;
import static android.content.Context.NOTIFICATION_SERVICE;

public class InternetReceiver extends BroadcastReceiver {
    NotificationCompat.Builder mBuilder;
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager manager=(ConnectivityManager)context.getSystemService(CONNECTIVITY_SERVICE);
        if(manager.getActiveNetwork()!=null)
        {
            mBuilder = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.icons8_alarm_16)
                    .setContentTitle("new noti")
                    .setContentText("có mạng");
            NotificationManager notificationManager =(NotificationManager)context.getSystemService(NOTIFICATION_SERVICE);

            notificationManager.notify(0,mBuilder.build());
        }
        else
        {
            mBuilder = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.icons8_alarm_16)
                    .setContentTitle("new noti")
                    .setContentText("no network availble");
            NotificationManager notificationManager =(NotificationManager)context.getSystemService(NOTIFICATION_SERVICE);

            notificationManager.notify(0,mBuilder.build());
        }
    }
}
