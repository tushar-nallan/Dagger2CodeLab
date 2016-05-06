package com.mutualmobile.android.dagger2codelab.concrete;


import com.mutualmobile.android.dagger2codelab.inteface.Heater;
import com.mutualmobile.android.dagger2codelab.inteface.Pump;

import javax.inject.Inject;

public class CoffeeMaker {
    private final Heater heater;
    private final Pump pump;

    @Inject
    public CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public Coffee makeCoffee() {
        pump.pump();
        Coffee coffee = new Coffee();
        heater.heat(coffee);
        return coffee;
    }
}