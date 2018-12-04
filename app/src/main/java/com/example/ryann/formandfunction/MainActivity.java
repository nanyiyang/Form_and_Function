package com.example.ryann.formandfunction;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /**
     * Stores a String of Weather output returned from the API Call
     */
    public static String weather;

    /**
     * Stores an integer value of temperature in Celsius/ Fahrenheit returned from API Call
     */
    public static int temperature;

    /**
     * Used to check if Fetch Weather button has been pressed. Go to All Clothing Button and
     * Go To Random Outfit Button, when pressed without first pressing the Fetch Weather Button,
     * will return a Fab Message.
     */
    public boolean fetchWeatherCheck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        goToAllClothing();
        goToRandomOutfit();

    }
    private void goToAllClothing() {
        Button allClothesButton = (Button) findViewById(R.id.allClothesButton);
        allClothesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AllClothing.class));
            }
        });
    }
    private void goToRandomOutfit() {
        Button randomOutfitButton = (Button) findViewById(R.id.randomOutfitButton);
        randomOutfitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RandomOutfit.class));
            }
        });
    }

    private void fetchWeather() {
        Button fetchWeatherNow = (Button) findViewById(R.id.refreshWeatherButton);
        // Do API Call and return Weather and Location. This should store the weather and
        // temperature as a string/ int in the above variables.

        // Display the Weather, Location and Temperature in TextView respectively.

    }


}
