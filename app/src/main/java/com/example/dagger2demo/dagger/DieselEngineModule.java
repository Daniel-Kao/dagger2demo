package com.example.dagger2demo.dagger;

import com.example.dagger2demo.car.DieselEngine;
import com.example.dagger2demo.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
