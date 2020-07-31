package com.example.dagger2demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.car.Car;
import com.example.dagger2demo.dagger.ActivityComponent;
import com.example.dagger2demo.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory().create(100, 10000);

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}