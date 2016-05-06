package com.mutualmobile.android.dagger2codelab.concrete;

import android.util.Log;

import com.mutualmobile.android.dagger2codelab.inteface.Heater;

/**
 * Created by tushar on 5/5/16.
 */
public class SolarHeater implements Heater {
    @Override
    public void heat(Object object) {
        Log.d("SolarHeater", "heating " + object.getClass().getSimpleName());
    }
}
