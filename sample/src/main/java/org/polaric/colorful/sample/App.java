package org.polaric.colorful.sample;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;

import org.polaric.colorful.Colorful;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Colorful.defaults()
                .primaryColor(Colorful.ThemeColor.RED)
                .accentColor(Colorful.ThemeColor.BLUE)
                .translucent(false)
                .dark(true);

        Colorful.init(this);
    }


    public static void setApplyThemeRuntime(Context context,Colorful.ThemeColor primary, Colorful.ThemeColor accent)
    {
        Colorful.config(context)
                .primaryColor(primary)
                .accentColor(accent)
                .translucent(false)
                .dark(true)
                .apply();
    }



    public static void showLog(String strMessage) {
        Log.v("==App==", "--strMessage--" + strMessage);
    }

}
