package com.example.ryann.formandfunction;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class AllClothing extends AppCompatActivity {

//    public static double temperature;
//    public static String style;
//    private static String gender;
//    private static double precipitation;
//
//    // Setter for Gender
//    public static void setGender(String newGender) {
//        gender = newGender;
//    }
//
//    // Setter for Style Preference
//    public static void setStyle(String newStyle) {
//        style = newStyle;
//    }
//
//    // Setter for Temperature where the input comes from the API Call.
//    public static void setTemperature(double newTemperature) {
//        temperature = newTemperature;
//    }
//
//    // Setter for Precipitation where the input comes from the API Call. Yet to be coded for MainActivity.
//    public static void setPrecipitation(double newPrecipitation) {
//        precipitation = newPrecipitation;
//    }
//
//    public static String getStyle() {
//        if (style == null) {
//            return null;
//        }
//        return style;
//    }
//
//    public static String getGender() {
//        if (gender == null) {
//            return null;
//        }
//        return gender;
//    }
//
//    public static double getTemperature() {
//        return temperature;
//    }
//
//    public static double getPrecipitation() {
//        return precipitation;
//    }

    // Tentatively set the weather where you require coat/ winter jacket is below 45.0 Fahrenheit
    public void getCorrectClothing() {
        try {
            // Selects clothing suitable for this weather.
            if (MainActivity.globalTemperature < 45) {
                if (MainActivity.globalPrecipitation > 0.0) {
                    // Returns clothing that is suitable for temperature below 45.0F and for Rainy weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {
                        LinearLayout maleStreet = (LinearLayout) findViewById(R.id.maleStreet);
                        maleStreet.setVisibility(View.GONE);

                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {

                    } else {
                        throw new NullPointerException();
                    }
                } else {
                    // Returns clothing that is suitable for temperature below 45.0F and for Sunny weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {

                    } else {
                        throw new NullPointerException();
                    }
                }

                // Temperature is above 45.0
            } else {
                if (MainActivity.globalTemperature > 0.0) {
                    // Returns clothing that is suitable for temperature above 45.0F and for Rainy weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {

                    } else {
                        throw new NullPointerException();
                    }
                } else {
                    // Returns clothing that is suitable for temperature above 45.0F and for Sunny weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {

                    } else {
                        throw new NullPointerException();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("test", "ERROR NOT ALL PARAMETERS SET");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getCorrectClothing();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_clothing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }





}
