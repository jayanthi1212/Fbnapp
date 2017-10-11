package com.ench.jaya.fbnapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by enchanter25 on 4/7/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent =new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_ONE_SHOT);
        NotificationCompat.Builder not = new NotificationCompat.Builder(this);
        not.setContentTitle(" FCM NOTIFICATION");
        not.setContentText(remoteMessage.getNotification().getBody());
        not.setAutoCancel(true);
        not.setSmallIcon(R.mipmap.ic_launcher);
        not.setContentIntent(pendingIntent);
        NotificationManager nom =(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nom.notify(0,not.build());

    }
}
