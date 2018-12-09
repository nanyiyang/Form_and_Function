package com.example.ryann.formandfunction;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.Random;

public class HomeScreen extends AppCompatActivity {

    public static String gender;

    public static String preference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void nextBTN(View view){
        boolean canAdvance = false;
        RadioGroup preferenceGroup = (RadioGroup) findViewById(R.id.preferenceGroup);
        RadioGroup genderGroup = (RadioGroup) findViewById(R.id.genderGroup);
        if (preferenceGroup.getCheckedRadioButtonId() == -1 || genderGroup.getCheckedRadioButtonId() == -1) {
            Snackbar.make(view, "Error, please select preferences.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
        } else {
            canAdvance = true;
        }
        if (canAdvance) {
            AllClothing.setGender(gender);
            RandomOutfit.setGender(gender);
            AllClothing.setStyle(preference);
            RandomOutfit.setStyle(preference);
            startActivity(new Intent(HomeScreen.this, MainActivity.class));
        }
    }


    /**
     * Used to set values according to the radio buttons being selected. Set values of gender and
     * preference as Strings.
     * @param view
     */
    public void buttonPreference(View view) {
        boolean check = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.genderButtonMale:
                if (check)
                    gender = "Male";
                break;

            case R.id.genderButtonFemale:
                if (check)
                    gender = "Female";
                break;
        }
        switch (view.getId()) {
            case R.id.styleButtonSmart:
                if (check)
                    preference = "Smart";
                break;
            case R.id.styleButtonStreet:
                if (check)
                    preference = "Street";
                break;
        }

    }


}
