package com.mutualmobile.android.dagger2codelab.inject.components;

import com.mutualmobile.android.dagger2codelab.MainActivity;
import com.mutualmobile.android.dagger2codelab.inject.modules.DripCoffeeModule;

import dagger.Component;

/**
 * Created by tushar on 5/6/16.
 */
@Component(modules = {
        DripCoffeeModule.class
})
public interface CoffeeComponent {
    void inject(MainActivity activity);
}
