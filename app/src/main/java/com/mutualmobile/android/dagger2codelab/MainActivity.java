package com.mutualmobile.android.dagger2codelab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mutualmobile.android.dagger2codelab.concrete.Coffee;
import com.mutualmobile.android.dagger2codelab.concrete.CoffeeMaker;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    CoffeeMaker coffeeMaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getComponent().inject(this);

        Coffee coffee = coffeeMaker.makeCoffee();
        if(coffee != null) {
            Log.d("Coffee", "Coffee ready! "+coffee);
        } else {
            Log.e("Coffee", "Coffee making FAILED");
        }
    }
}
