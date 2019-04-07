package com.example.android.cricbuzz;


import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.cricbuzz.R;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int wicketsA = 0;
    int wicketsB=0;
    int sixesA = 0;
    int foursA = 0;
    int doublesA = 0;
    int singlesA = 0;
    int sixesB = 0;
    int foursB = 0;
    int doublesB = 0;
    int singlesB = 0;
    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixesA(View view) {
        sixesA = sixesA + 1;

    }
    public void sixesB(View view) {
        sixesB = sixesB + 1;

    }

    public void foursA(View view) {
        foursA = foursA + 1;

    }
    public void foursB(View view) {
        foursB = foursB + 1;

    }

    public void doublesA(View view) {
        doublesA = doublesA + 1;

    }

    public void doublesB(View view) {
        doublesB = doublesB + 1;

    }


    public void singlesA(View view) {
        singlesA = singlesA + 1;

    }

    public void singlesB(View view) {
        singlesB = singlesB + 1;

    }

    /**
     * This method is called when the plus button is clicked.
     */

    public void incrementA(View view) {
       if (wicketsA<10)
       {wicketsA = wicketsA + 1;
           displayA(wicketsA);}
    }


    public void incrementB(View view) {
        if (wicketsB<10)
        {wicketsB = wicketsB + 1;
            displayB(wicketsB);}
    }

    /**
     * This method is called when the minus button is clicked.
     */

    public void decrementB(View view) {
        if (wicketsB >= 1) {
            wicketsB = wicketsB - 1;
        }
        displayB(wicketsB);
    }

    public void decrementA(View view) {
        if (wicketsA >= 1) {
            wicketsA = wicketsA - 1;
        }
        displayA(wicketsA);
    }



    public void scoreA(View view) {
        int scoreA = singlesA + doublesA * 2 + foursA * 4 + sixesA * 6;
        String scoreMessage = scoreA + " runs";
        scoreMessage = scoreMessage + " & " + wicketsA + " wickets !!!";
        displayMessageA(scoreMessage);
    }

    public void scoreB(View view) {
        int scoreB = singlesB + doublesB * 2 + foursB * 4 + sixesB * 6;
        String scoreMessage = scoreB + " runs";
        scoreMessage = scoreMessage + " & " + wicketsB + " wickets !!!";
        displayMessageB(scoreMessage);
    }

    private void displayA(int number) {
        TextView wicketsTextView = findViewById(R.id.wicketsA_text_view);
        wicketsTextView.setText("" + number);
    }
    private void displayB(int number) {
        TextView wicketsTextView = findViewById(R.id.wicketsB_text_view);
        wicketsTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessageA(String message) {
        TextView scoreTextView = findViewById(R.id.scoreA_text_view);
        scoreTextView.setText(message);
    }

    private void displayMessageB(String message) {
        TextView scoreTextView = findViewById(R.id.scoreB_text_view);
        scoreTextView.setText(message);
    }

    public void reset(View view ){
        wicketsA = 0;
        wicketsB=0;
        sixesA = 0;
        foursA = 0;
        doublesA = 0;
        singlesA = 0;
        sixesB = 0;
        foursB = 0;
        doublesB = 0;
        singlesB = 0;
        scoreA=0;
        scoreB=0;
        displayA(wicketsA);
        displayB(wicketsB);

        displayscoreA(scoreA);
        displayscoreB(scoreB);
    }

    private void displayscoreA(int scoreA){
        TextView scoreTextView = findViewById(R.id.scoreA_text_view);
        scoreTextView.setText(""+scoreA);
    }

    private void displayscoreB(int scoreB){
        TextView scoreTextView = findViewById(R.id.scoreB_text_view);
        scoreTextView.setText(""+scoreB);

    }


}






