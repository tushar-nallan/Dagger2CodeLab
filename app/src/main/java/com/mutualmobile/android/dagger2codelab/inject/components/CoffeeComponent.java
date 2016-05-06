package com.mutualmobile.android.dagger2codelab.inject.components;

import com.mutualmobile.android.dagger2codelab.MainActivity;
import com.mutualmobile.android.dagger2codelab.concrete.CoffeeMaker;
import com.mutualmobile.android.dagger2codelab.inject.Solar;
import com.mutualmobile.android.dagger2codelab.inject.modules.DripCoffeeModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tushar on 5/6/16.
 */
@Component(modules = {
        DripCoffeeModule.class
})
@Singleton
public interface CoffeeComponent {
    void inject(MainActivity activity);

    CoffeeMaker getCoffeeMaker();

    @Solar
    CoffeeMaker getSolarCoffeeMaker();
}
