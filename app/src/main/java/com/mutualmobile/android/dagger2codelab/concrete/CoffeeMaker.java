package com.mutualmobile.android.dagger2codelab.concrete;


import com.mutualmobile.android.dagger2codelab.inteface.Heater;
import com.mutualmobile.android.dagger2codelab.inteface.Pump;

public class CoffeeMaker {
    private final Heater heater;
    private final Pump pump;

    public CoffeeMaker() {
        this.heater = new ElectricHeater();
        this.pump = new Thermosiphon(heater);
    }

    public Coffee makeCoffee() {
        pump.pump();
        Coffee coffee = new Coffee();
        heater.heat(coffee);
        return coffee;
    }
}