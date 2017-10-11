package com.ench.jaya.fbnapp;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by enchanter25 on 4/7/17.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String REQ_TOKEN  = "REQ_TOKEN";

    @Override
    public void onTokenRefresh() {

        String recent_token= FirebaseInstanceId.getInstance().getToken();
        Log.d(REQ_TOKEN,recent_token);

    }
}
