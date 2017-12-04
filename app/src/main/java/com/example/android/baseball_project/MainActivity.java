package com.example.android.baseball_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int runA = 0;
    int runB = 0;
    int outA = 0;
    int outB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void runPlusOneA(View view){
        runA = runA + 1;
        displayForTeamA(runA);
    }

    public void outPlusOneA(View view){
        outA = outA + 1;
        displayForTeamAOut(outA);
    }

    public void runPlusOneB(View view){
        runB = runB + 1;
        displayForTeamB(runB);
    }

    public void onePlusOutB(View view){
        outB = outB + 1;
        displayForTeamBOut(outB);
    }
    public void resetScore(View view){
        outA = 0;
        outB = 0;
        runA = 0;
        runB = 0;
        displayForTeamA(runA);
        displayForTeamB(runB);
        displayForTeamAOut(outA);
        displayForTeamBOut(outB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamAOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_out);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamBOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_out);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
