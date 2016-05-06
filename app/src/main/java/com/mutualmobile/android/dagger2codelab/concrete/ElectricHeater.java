package com.mutualmobile.android.dagger2codelab.concrete;

import android.util.Log;

import com.mutualmobile.android.dagger2codelab.inteface.Heater;

/**
 * Created by tushar on 5/5/16.
 */
public class ElectricHeater implements Heater {
    @Override
    public void heat(Object object) {
        Log.d("ElectricHeater", "heating "+object.getClass().getSimpleName());
    }
}
