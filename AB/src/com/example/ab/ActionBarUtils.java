package com.example.ab;

import java.lang.reflect.Field;

import android.content.Context;
import android.view.ViewConfiguration;

public class ActionBarUtils
{

    public static void enableOverflowMenu(Context context)
    {
        try
        {
            ViewConfiguration config = ViewConfiguration.get(context);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (menuKeyField != null)
            {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
