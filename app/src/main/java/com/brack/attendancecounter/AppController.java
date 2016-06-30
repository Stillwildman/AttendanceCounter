package com.brack.attendancecounter;

import android.app.Application;
import android.content.Context;

/**
 * Created by vincent.chang on 2016/6/29.
 */
public class AppController extends Application {

    private static AppController appInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        appInstance = this;
        SettingManager.initPreferences();
    }

    public Context getAppContext() {
        return getApplicationContext();
    }

    public static synchronized AppController getInstance() {
        return appInstance;
    }
}
