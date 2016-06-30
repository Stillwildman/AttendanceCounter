package com.brack.attendancecounter;

import android.content.res.Configuration;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;

/**
 * Created by vincent.chang on 2016/6/30.
 */
public class Utility {

    public static boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    public static void setTextColorByCount(int count, TextView textView) {
        if (count < 6)
            textView.setTextColor(ContextCompat.getColor(AppController.getInstance().getAppContext(), R.color.md_black_1000));

        if (count >= 6)
            textView.setTextColor(ContextCompat.getColor(AppController.getInstance().getAppContext(), R.color.md_amber_700));

        if (count >= 10)
            textView.setTextColor(ContextCompat.getColor(AppController.getInstance().getAppContext(), R.color.md_red_600));
    }

    protected static boolean isPortrait() {
        return AppController.getInstance().getResources().getConfiguration().orientation  == Configuration.ORIENTATION_PORTRAIT;
    }
}
