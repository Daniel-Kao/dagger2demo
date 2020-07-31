package com.example.dagger2demo.dagger;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

//    Car getCar();

    void inject(MainActivity mainActivity);
}
