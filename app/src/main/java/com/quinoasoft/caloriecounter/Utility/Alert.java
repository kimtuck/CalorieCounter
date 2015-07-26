package com.quinoasoft.caloriecounter.Utility;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Robert on 7/26/2015.
 */
public class Alert {
    public static void show(Context context, String text) {
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }
}
