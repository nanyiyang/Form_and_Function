package com.example.ryann.formandfunction;

import android.app.DownloadManager;
import android.content.Intent;
import android.nfc.Tag;
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
//import com.google.android.gms.common.api.Response;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import java.net.URLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "MainActivity";

    /** Request queue for our network requests. */
    private static RequestQueue requestQueue;

    public static String globalLocation;
    public static String globalWeather;
    public static double globalTemperature;
    public static double globalPrecipitation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set up a queue for our Volley requests
        requestQueue = Volley.newRequestQueue(this);

        // Load the main layout for our activity
        setContentView(R.layout.activity_main);

    }

    public void goToAllClothing(View v) {
        startActivity(new Intent(MainActivity.this, AllClothing.class));
    }

    public void goToRandomOutfit(View v) {
        startActivity(new Intent(MainActivity.this, RandomOutfit.class));
    }

    public void refreshWeather(View view) {
        ProgressBar refreshIcon = (ProgressBar) findViewById(R.id.progressBar);
        refreshIcon.setVisibility(View.VISIBLE);
        Button fetchWeatherNow = (Button) findViewById(R.id.refreshWeatherButton);
        //disables button so it can't be spammed.
        fetchWeatherNow.setEnabled(false);
        startAPICall();
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

    void startAPICall() {
        try {
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                    Request.Method.GET,
                    "http://api.apixu.com/v1/current.json?key=7ad51d0551364c7c926203525180712&q=61801",
                    null,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(final JSONObject response) {
                            Log.d(TAG, response.toString());
                            try {
                                // Finds temperature
                                JSONObject weatherTemp = response.getJSONObject("current");
                                Double temperature = weatherTemp.getDouble("temp_f");
                                globalTemperature = temperature;
                                String temperatureString = temperature.toString();
                                Log.d(TAG, temperatureString);
                                // set button to change
                                TextView temperatureValue = (TextView) findViewById(R.id.temperatureValue);
                                String temperatureStringToPrint = temperatureString + " " + "\u00b0" + "F";
                                temperatureValue.setText(temperatureStringToPrint);

                                // Finds location
                                JSONObject weatherLocation = response.getJSONObject("location");
                                String locationString = weatherLocation.getString("name");
                                globalLocation = locationString;
                                Log.d(TAG, locationString);
                                // set button to change
                                TextView locationValue = (TextView) findViewById(R.id.locationValue);
                                locationValue.setText(locationString);

                                // Finds weather
                                JSONObject weather = response.getJSONObject("current");
                                JSONObject weather1 = weather.getJSONObject("condition");
                                String weatherString = weather1.getString("text");
                                globalWeather = weatherString;
                                Log.d(TAG, weatherString);
                                // set button to change
                                TextView weatherValue = (TextView) findViewById(R.id.weatherValue);
                                weatherValue.setText(weatherString);

                                // Finds rain level
                                JSONObject weatherPrecip = response.getJSONObject("current");
                                Double precipitation = weatherPrecip.getDouble("precip_mm");
                                globalPrecipitation = precipitation;
                                String precipitationString = precipitation.toString();
                                Log.d(TAG, precipitationString);
                            } catch (JSONException e) {
                                Log.d(TAG, "ERROR JSON FILE PARSED INCORRECTLY");
                            }
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(final VolleyError error) {
                            Log.d(TAG, "VOLLEY ERROR DID NOT RECEIVE A  VALID JSON FILE");
                            Log.d(TAG, error.toString());
                        }
                    });
            requestQueue.add(jsonObjectRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
