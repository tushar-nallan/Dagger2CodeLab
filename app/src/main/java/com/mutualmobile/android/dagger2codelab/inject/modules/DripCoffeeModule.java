package com.mutualmobile.android.dagger2codelab.inject.modules;

import com.mutualmobile.android.dagger2codelab.concrete.CoffeeMaker;
import com.mutualmobile.android.dagger2codelab.concrete.ElectricHeater;
import com.mutualmobile.android.dagger2codelab.concrete.Thermosiphon;
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

}
