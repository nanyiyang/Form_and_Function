package com.example.ryann.formandfunction;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class RandomOutfit extends AppCompatActivity {

    private static double temperature;
    private static String style;
    private static String gender;

    // Setter for Gender
    public static void setGender(String newGender) {
        gender = newGender;
    }

    // Setter for Style Preference
    public static void setStyle(String newStyle) {
        style = newStyle;
    }

    // Setter for Temperature where the input comes from the API Call.
    public static void setTemperature(double newTemperature) {
        temperature = newTemperature;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_outfit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}
