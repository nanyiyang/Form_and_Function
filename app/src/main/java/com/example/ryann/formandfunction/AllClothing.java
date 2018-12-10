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
        LinearLayout femaleStreet = (LinearLayout) findViewById(R.id.femaleStreet);
        LinearLayout femaleSmart = (LinearLayout) findViewById(R.id.femaleSmart);
        LinearLayout accessory = (LinearLayout) findViewById(R.id.accessory);
        LinearLayout chelseaBoots = (LinearLayout) findViewById(R.id.chelseaBoots);
        LinearLayout chinoPants = (LinearLayout) findViewById(R.id.chinos);
        LinearLayout oxfordShirt = (LinearLayout) findViewById(R.id.oxfordShirt);
        LinearLayout overcoat = (LinearLayout) findViewById(R.id.overcoat);
        LinearLayout maleDressPants = (LinearLayout) findViewById(R.id.dressPants);
        LinearLayout maleDressShoes = (LinearLayout) findViewById(R.id.dressShoes);
        LinearLayout parka = (LinearLayout) findViewById(R.id.parka);
        LinearLayout flannel = (LinearLayout) findViewById(R.id.flannelShirt);
        LinearLayout tShirt = (LinearLayout) findViewById(R.id.tshirt);
        LinearLayout sneakers = (LinearLayout) findViewById(R.id.sneakers);
        LinearLayout winterBoots = (LinearLayout) findViewById(R.id.winterboots);
        LinearLayout vNeckTShirt = (LinearLayout) findViewById(R.id.vnecktshirt);
        LinearLayout femaleParka = (LinearLayout) findViewById(R.id.femaleParka);
        LinearLayout femaleSneakers = (LinearLayout) findViewById(R.id.femalesneakers);

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
                        femaleSmart.setVisibility(View.VISIBLE);
                        accessory.setVisibility(View.VISIBLE);

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {
                        maleStreet.setVisibility(View.VISIBLE);
                        flannel.setVisibility(View.GONE);
                        tShirt.setVisibility(View.GONE);
                        sneakers.setVisibility(View.GONE);
                        accessory.setVisibility(View.VISIBLE);

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {
                        femaleStreet.setVisibility(View.VISIBLE);
                        vNeckTShirt.setVisibility(View.GONE);
                        femaleSneakers.setVisibility(View.GONE);
                        accessory.setVisibility(View.VISIBLE);

                    }
                } else {
                    // Returns clothing that is suitable for temperature below 45.0F and for Sunny weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {
                        maleSmart.setVisibility(View.VISIBLE);
                        chelseaBoots.setVisibility(View.GONE);
                        chinoPants.setVisibility(View.GONE);
                        oxfordShirt.setVisibility(View.GONE);

                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {
                        femaleSmart.setVisibility(View.VISIBLE);

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {
                        maleStreet.setVisibility(View.VISIBLE);
                        flannel.setVisibility(View.GONE);
                        tShirt.setVisibility(View.GONE);
                        sneakers.setVisibility(View.GONE);

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {
                        femaleStreet.setVisibility(View.VISIBLE);
                        vNeckTShirt.setVisibility(View.GONE);
                        femaleSneakers.setVisibility(View.GONE);
                    }
                }

                // Temperature is above 45.0
            } else {
                if (MainActivity.globalPrecipitation > 0.0) {
                    // Returns clothing that is suitable for temperature above 45.0F and for Rainy weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {
                        maleSmart.setVisibility(View.VISIBLE);
                        overcoat.setVisibility(View.GONE);
                        maleDressPants.setVisibility(View.GONE);
                        maleDressShoes.setVisibility(View.GONE);
                        accessory.setVisibility(View.VISIBLE);
                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {
                        femaleSmart.setVisibility(View.VISIBLE);
                        accessory.setVisibility(View.VISIBLE);

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {
                        maleStreet.setVisibility(View.VISIBLE);
                        parka.setVisibility(View.GONE);
                        winterBoots.setVisibility(View.GONE);
                        accessory.setVisibility(View.VISIBLE);
                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {
                        femaleStreet.setVisibility(View.VISIBLE);
                        femaleParka.setVisibility(View.GONE);

                    }
                } else {
                    // Returns clothing that is suitable for temperature above 45.0F and for Sunny weather
                    if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Male")) {
                        maleSmart.setVisibility(View.VISIBLE);
                        overcoat.setVisibility(View.GONE);
                        maleDressPants.setVisibility(View.GONE);
                        maleDressShoes.setVisibility(View.GONE);

                    } else if (HomeScreen.globalPreference.equals("Smart") && HomeScreen.globalGender.equals("Female")) {
                        femaleSmart.setVisibility(View.VISIBLE);

                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Male")) {
                        maleStreet.setVisibility(View.VISIBLE);
                        parka.setVisibility(View.GONE);
                        winterBoots.setVisibility(View.GONE);
                    } else if (HomeScreen.globalPreference.equals("Street") && HomeScreen.globalGender.equals("Female")) {
                        femaleStreet.setVisibility(View.VISIBLE);
                        femaleParka.setVisibility(View.GONE);
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
