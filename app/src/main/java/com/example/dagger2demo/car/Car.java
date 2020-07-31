package com.example.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Wheels wheels;
    private Engine engine;


    @Inject
    public Car(Wheels wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
    
    public void drive() {
        Log.d(TAG, "drive: ");
        engine.start();
    }
}
