package com.example.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2demo.car.Car;
import com.example.dagger2demo.dagger.CarComponent;
import com.example.dagger2demo.dagger.DaggerCarComponent;
import com.example.dagger2demo.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(9999)
                .build();
        component.inject(this);

        car1.drive();
        car2.drive();
    }
}