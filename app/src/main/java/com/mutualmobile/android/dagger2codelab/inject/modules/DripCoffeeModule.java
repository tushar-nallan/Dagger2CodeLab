package com.mutualmobile.android.dagger2codelab.inject.modules;

import com.mutualmobile.android.dagger2codelab.concrete.CoffeeMaker;
import com.mutualmobile.android.dagger2codelab.concrete.ElectricHeater;
import com.mutualmobile.android.dagger2codelab.concrete.SolarHeater;
import com.mutualmobile.android.dagger2codelab.concrete.Thermosiphon;
import com.mutualmobile.android.dagger2codelab.inject.Solar;
import com.mutualmobile.android.dagger2codelab.inteface.Heater;
import com.mutualmobile.android.dagger2codelab.inteface.Pump;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tushar on 5/6/16.
 */
@Module
public class DripCoffeeModule {
    @Provides
    CoffeeMaker provideCoffeeMaker(Heater heater, Pump pump) {
        return new CoffeeMaker(heater, pump);
    }

    @Provides
    Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides
    Pump providePump(Heater heater) {
        return new Thermosiphon(heater);
    }

    @Provides
    @Solar
    CoffeeMaker provideSolarCoffeeMaker(@Solar Heater heater, @Solar Pump pump) {
        return new CoffeeMaker(heater, pump);
    }

    @Provides
    @Solar
    Heater provideSolarHeater() {
        return new SolarHeater();
    }

    @Provides
    @Solar
    Pump providePumpWithSolarHeater(@Solar Heater heater) {
        return new Thermosiphon(heater);
    }
}