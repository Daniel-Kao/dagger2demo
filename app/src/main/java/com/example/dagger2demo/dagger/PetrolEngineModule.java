package com.example.dagger2demo.dagger;

import com.example.dagger2demo.car.Engine;
import com.example.dagger2demo.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
