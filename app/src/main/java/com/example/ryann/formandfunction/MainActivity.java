package com.example.ryann.formandfunction;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Button;
import java.net.URLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    public static String weather;
    public static int temperature;

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
        TextView weatherValue = findViewById(R.id.weatherValue);
        // Do API Call and return Weather and Location. This should store the weather and
        // temperature as a string/ int in the above variables.
        try {
            URL myURL = new URL("https://www.metaweather.com/api/location/44418/");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
        }
        catch (Exception e) {
            // new URL() failed
            // ...
        }

        // Display the Weather, Location and Temperature in TextView respectively.

    }
    public void refreshWeather(View view) {
        ProgressBar refreshIcon = (ProgressBar) findViewById(R.id.progressBar);
        refreshIcon.setVisibility(View.VISIBLE);
        Button fetchWeatherNow = (Button) findViewById(R.id.refreshWeatherButton);
        //disables button so it can't be spammed.
        fetchWeatherNow.setEnabled(false);

        new CountDownTimer(2000, 1000) {
            public void onTick(long millisUntilFinished) { }
            public void onFinish() {
                ProgressBar refreshIcon = (ProgressBar) findViewById(R.id.progressBar);
                refreshIcon.setVisibility(View.INVISIBLE);
                Button fetchWeatherNow = (Button) findViewById(R.id.refreshWeatherButton);
                //Enables button after loading icon disappears.
                fetchWeatherNow.setEnabled(true);
            }
        }.start();
    }


}
