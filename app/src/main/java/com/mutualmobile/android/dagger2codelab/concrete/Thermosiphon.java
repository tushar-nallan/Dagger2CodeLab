package com.mutualmobile.android.dagger2codelab.concrete;

import android.util.Log;

import com.mutualmobile.android.dagger2codelab.inteface.Heater;
import com.mutualmobile.android.dagger2codelab.inteface.Pump;

/**
 * Created by tushar on 5/5/16.
 */
public class Thermosiphon implements Pump {
    private final Heater heater;

    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        heater.heat(this);
        Log.d("Thermosiphon", "pumping coffee");
    }
}