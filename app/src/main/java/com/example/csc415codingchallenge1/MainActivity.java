package com.example.csc415codingchallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

/**
 * Main Activity Class which contains three buttons, each button contains an onClick method which
 * will launch SecondActivity and display a different song/lyric based on the button clicked.
 * @author Cory Bradford
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This onClick method as well as @buttonTwoOnClick and @buttonThreeOnClick will pull unique song
     * information based on the button selected from the String resource file, and add it to an array
     * which will then be passed as an intent extra to the second activity.
     * @param view
     */
    public void buttonOneOnClick(View view) {
        String _BAND = getString(R.string.band);
        String _TITLE = getString(R.string.title_one);
        String _LYRICS = getString(R.string.lyrics_one);
        String[] INFORMATION = new String[]{_BAND, _TITLE, _LYRICS};

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("information", INFORMATION);

        startActivity(intent);
    }

    public void buttonTwoOnClick(View view) {
        String _BAND = getString(R.string.band);
        String _TITLE = getString(R.string.title_two);
        String _LYRICS = getString(R.string.lyrics_two);
        String[] INFORMATION = new String[]{_BAND, _TITLE, _LYRICS};

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("information", INFORMATION);

        startActivity(intent);
    }

    public void buttonThreeOnClick(View view) {
        String _BAND = getString(R.string.band);
        String _TITLE = getString(R.string.title_three);
        String _LYRICS = getString(R.string.lyrics_three);
        String[] INFORMATION = new String[]{_BAND, _TITLE, _LYRICS};

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("information", INFORMATION);

        startActivity(intent);
    }
}