package com.quinoasoft.caloriecounter.Utility;

import android.widget.EditText;

/**
 * Created by Robert on 7/26/2015.
 */
public class Value {
    public static int toInt(EditText textField){
        int val = 0;
        try {
            val = Integer.parseInt(textField.getText().toString());
        }
        catch (NumberFormatException e){
            // TODO so something
        }
        return val;
    }
}
