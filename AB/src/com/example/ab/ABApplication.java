package com.example.ab;

import android.app.Application;

public class ABApplication extends Application
{
    
    @Override
    public void onCreate()
    {
        super.onCreate();
        ActionBarUtils.enableOverflowMenu(this);
    }

}
