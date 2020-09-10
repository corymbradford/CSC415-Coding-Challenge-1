package com.example.csc415codingchallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Second Activity Class which contains a Linear Layout embedded within a Scroll View. The activity
 * pulls information from the Intent extra to be displayed in Text Views within the Linear Layout.
 * @author Cory Bradford
 * @version 1.0
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        Intent intent = getIntent();
        String[] information = intent.getStringArrayExtra("information");

        //initializing the empty TextView objects
        TextView band = new TextView(this);
        TextView title = new TextView(this);
        TextView lyrics = new TextView(this);

        //setting the text of the TextView objects to be what was passed in the intent extras
        band.setText(information[0]);
        title.setText(information[1]);
        lyrics.setText(information[2]);

        //setting size/style attributes for each TextView object
        band.setTextSize(24);
        band.setTypeface(null, Typeface.BOLD);
        title.setTextSize(14);
        lyrics.setTextSize(16);

        //adding the TextView objects to the linear layout
        linearLayout.addView(band);
        linearLayout.addView(title);
        linearLayout.addView(lyrics);
    }


}