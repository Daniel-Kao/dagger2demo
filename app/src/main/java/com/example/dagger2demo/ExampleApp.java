package com.example.dagger2demo;

import android.app.Application;

import com.example.dagger2demo.dagger.AppComponent;
import com.example.dagger2demo.dagger.DaggerAppComponent;
import com.example.dagger2demo.dagger.DriverModule;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("daniel"));
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
