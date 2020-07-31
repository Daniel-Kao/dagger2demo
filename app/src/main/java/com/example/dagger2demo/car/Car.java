package com.example.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Wheels wheels;
    private Engine engine;
    private Driver driver;


    @Inject
    public Car(Wheels wheels, Engine engine, Driver driver) {
        this.wheels = wheels;
        this.engine = engine;
        this.driver = driver;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
    
    public void drive() {
        Log.d(TAG, driver + "drive: " + this);
        engine.start();
    }
}
