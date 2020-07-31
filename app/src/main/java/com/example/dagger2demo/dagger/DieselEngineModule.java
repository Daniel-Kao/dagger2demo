package com.example.dagger2demo.dagger;

import com.example.dagger2demo.car.DieselEngine;
import com.example.dagger2demo.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
       return engine;
    }
}
