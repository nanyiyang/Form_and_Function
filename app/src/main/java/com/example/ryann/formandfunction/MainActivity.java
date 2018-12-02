package com.example.ryann.formandfunction;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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



}
