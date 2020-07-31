package com.example.dagger2demo.dagger;

import com.example.dagger2demo.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    private String dirverName;

    public DriverModule(String dirverName) {
        this.dirverName = dirverName;
    }

    @Provides
    @Singleton
     Driver provideDriver() {
        return new Driver(dirverName);
    }
}
