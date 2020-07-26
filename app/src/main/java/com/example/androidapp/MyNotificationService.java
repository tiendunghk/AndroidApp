package com.example.androidapp;

import android.app.NotificationManager;
import android.net.Uri;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyNotificationService extends FirebaseMessagingService {
    NotificationCompat.Builder mBuilder;
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        mBuilder = new NotificationCompat.Builder(this.getApplicationContext()).setSmallIcon(R.drawable.icons8_alarm_16)
                .setContentTitle(remoteMessage.getNotification().getTitle())
                .setContentText(remoteMessage.getNotification().getBody());
        Uri sound=Uri.parse("android.resource"+"://"+getPackageName()+"/"+R.raw.swiftly);
        mBuilder.setSound(sound);

        NotificationManager notificationManager =(NotificationManager)this.getApplicationContext().getSystemService(NOTIFICATION_SERVICE);

        notificationManager.notify(0,mBuilder.build());

    }
}
