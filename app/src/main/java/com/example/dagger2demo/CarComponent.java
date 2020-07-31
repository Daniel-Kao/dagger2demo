package com.example.dagger2demo;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {

//    Car getCar();

    void inject(MainActivity mainActivity);
}
