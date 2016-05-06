package com.mutualmobile.android.dagger2codelab;

import android.app.Application;

import com.mutualmobile.android.dagger2codelab.inject.components.CoffeeComponent;
import com.mutualmobile.android.dagger2codelab.inject.components.DaggerCoffeeComponent;

/**
 * Created by tushar on 5/6/16.
 */
public class MyApplication extends Application {

    private CoffeeComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerCoffeeComponent.builder().build();

    }

    public CoffeeComponent getComponent() {
        return component;
    }
}
