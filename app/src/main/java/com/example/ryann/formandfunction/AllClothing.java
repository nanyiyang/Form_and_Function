package com.example.ryann.formandfunction;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AllClothing extends AppCompatActivity {

    private static double temperature;
    private static String style;
    private static String gender;
    private static double precipitation;

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

    // Setter for Precipitation where the input comes from the API Call. Yet to be coded for MainActivity.
    public static void setPrecipitation(double newPrecipitation) {
        precipitation = newPrecipitation;
    }

    public static String getStyle() {
        if (style == null) {
            return null;
        }
        return style;
    }

    public static String getGender() {
        if (gender == null) {
            return null;
        }
        return gender;
    }

    public static double getTemperature() {
        return temperature;
    }

    public static double getPrecipitation() {
        return precipitation;
    }

    // Tentatively set the weather where you require coat/ winter jacket is below 30.0 Fahrenheit
    public static void getCorrectClothing() {
        try {
            // Selects clothing suitable for this weather.
            if (getTemperature() < 30.0) {
                if (getPrecipitation() > 0.0) {
                    // Returns clothing that is suitable for temperature below 30.0F and for Rainy weather
                    if (getStyle() == "Smart" && getGender() == "Male") {

                    } else if (getStyle() == "Smart" && getGender() == "Female") {

                    } else if (getStyle() == "Street" && getGender() == "Male") {

                    } else if (getStyle() == "Street" && getGender() == "Female") {

                    } else {
                        throw new NullPointerException();
                    }
                } else {
                    // Returns clothing that is suitable for temperature below 30.0F and for Sunny weather
                    if (getStyle() == "Smart" && getGender() == "Male") {

                    } else if (getStyle() == "Smart" && getGender() == "Female") {

                    } else if (getStyle() == "Street" && getGender() == "Male") {

                    } else if (getStyle() == "Street" && getGender() == "Female") {

                    } else {
                        throw new NullPointerException();
                    }
                }

                // Temperature is above 30.0
            } else {

                if (getPrecipitation() > 0.0) {
                    // Returns clothing that is suitable for temperature above 30.0F and for Rainy weather
                    if (getStyle() == "Smart" && getGender() == "Male") {

                    } else if (getStyle() == "Smart" && getGender() == "Female") {

                    } else if (getStyle() == "Street" && getGender() == "Male") {

                    } else if (getStyle() == "Street" && getGender() == "Female") {

                    } else {
                        throw new NullPointerException();
                    }
                } else {
                    // Returns clothing that is suitable for temperature above 30.0F and for Sunny weather
                    if (getStyle() == "Smart" && getGender() == "Male") {

                    } else if (getStyle() == "Smart" && getGender() == "Female") {

                    } else if (getStyle() == "Street" && getGender() == "Male") {

                    } else if (getStyle() == "Street" && getGender() == "Female") {

                    } else {
                        throw new NullPointerException();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_clothing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }





}
