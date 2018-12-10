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


    // Tentatively set the weather where you require coat/ winter jacket is below 45.0 Fahrenheit
    public void getCorrectClothing() {
        LinearLayout maleStreet = (LinearLayout) findViewById(R.id.maleStreet);
        LinearLayout maleSmart = (LinearLayout) findViewById(R.id.maleSmart);
        LinearLayout accessory = (LinearLayout) findViewById(R.id.accessory);
        LinearLayout chelseaBoots = (LinearLayout) findViewById(R.id.chelseaBoots);
        LinearLayout chinoPants = (LinearLayout) findViewById(R.id.chinos);
        LinearLayout oxfordShirt = (LinearLayout) findViewById(R.id.oxfordShirt);
        LinearLayout overcoat = (LinearLayout) findViewById(R.id.overcoat);
        LinearLayout maleDressPants = (LinearLayout) findViewById(R.id.dressPants);
        LinearLayout maleDressShoes = (LinearLayout) findViewById(R.id.dressShoes);


        try {
            // Selects clothing suitable for this weather.
            if (MainActivity.globalTemperature < 45.0) {
                if (MainActivity.globalPrecipitation > 0.0) {
                    // Returns clothing that is suitable for temperature below 45.0F and for Rainy weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {
                        maleSmart.setVisibility(View.VISIBLE);
                        chelseaBoots.setVisibility(View.GONE);
                        chinoPants.setVisibility(View.GONE);
                        oxfordShirt.setVisibility(View.GONE);
                        accessory.setVisibility(View.VISIBLE);


                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {
                        maleStreet.setVisibility(View.VISIBLE);
                        overcoat.setVisibility(View.GONE);
                        maleDressPants.setVisibility(View.GONE);
                        maleDressShoes.setVisibility(View.GONE);
                        accessory.setVisibility(View.VISIBLE);

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {

                    }
                } else {
                    // Returns clothing that is suitable for temperature below 45.0F and for Sunny weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {
                        maleSmart.setVisibility(View.VISIBLE);
                        chelseaBoots.setVisibility(View.GONE);
                        chinoPants.setVisibility(View.GONE);
                        oxfordShirt.setVisibility(View.GONE);
                        accessory.setVisibility(View.VISIBLE);

                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {
                        maleStreet.setVisibility(View.VISIBLE);
                        overcoat.setVisibility(View.GONE);
                        maleDressPants.setVisibility(View.GONE);
                        maleDressShoes.setVisibility(View.GONE);

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {

                    }
                }

                // Temperature is above 45.0
            } else {
                if (MainActivity.globalPrecipitation > 0.0) {
                    // Returns clothing that is suitable for temperature above 45.0F and for Rainy weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {

                    }
                } else {
                    // Returns clothing that is suitable for temperature above 45.0F and for Sunny weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {

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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_clothing);
        getCorrectClothing();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
