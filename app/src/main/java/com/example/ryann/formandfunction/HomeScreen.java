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

public class HomeScreen extends AppCompatActivity {

    /*** To check if either of the Radio Buttons for gender has been checked. Not finished. */
    private boolean genderCheckField = false;

    /*** To check if either of the Radio Buttons for preference type has been checked. Not finished.
     */
    private boolean preferenceCheckField = false;

    public static String gender;

    public static String preference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        

        goToActivityMain();
    }
    private void goToActivityMain() {
        Button homeScreenNextButton = (Button) findViewById(R.id.homeScreenNextButton);
        homeScreenNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this, MainActivity.class));
            }
        });

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
                    genderCheckField = true;
                break;

            case R.id.genderButtonFemale:
                if (check)
                    gender = "Female";
                    genderCheckField = true;
                break;
        }
        switch (view.getId()) {
            case R.id.styleButtonSmart:
                if (check)
                    preference = "Smart";
                    preferenceCheckField = true;
                break;
            case R.id.styleButtonStreet:
                if (check)
                    preference = "Street";
                    preferenceCheckField = true;
                break;
        }
    }

}
