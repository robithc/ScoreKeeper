package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeam1 = 0;
    int foulsTeam1 = 0;
    int yellowCardsTeam1 = 0;
    int redCardsTeam1 = 0;
    int scoreTeam2 = 0;
    int foulsTeam2 = 0;
    int yellowCardsTeam2 = 0;
    int redCardsTeam2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team 1.
     */
    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeam1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of fouls  for Team 1.
     */
    public void displayNumberOfFoulsForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numberFoulsTeam1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of yellow cards  for Team 1.
     */
    public void displayNumberOfYellowCardsOfTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numberYellowCardTeam1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of red cards  for Team 1.
     */
    public void displayNumberOfRedCardsOfTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numberRedCardTeam1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 1 goal for Team1.
     */
    public void addOneGoalTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Add 1 foul for Team1.
     */
    public void addOneFoulForTeam1(View v) {
        foulsTeam1 = foulsTeam1 + 1;
        displayNumberOfFoulsForTeam1(foulsTeam1);
    }

    /**
     * Add 1 yellow card for Team1.
     */
    public void addOneYellowCardForTeam1(View v) {
        yellowCardsTeam1 = yellowCardsTeam1 + 1;
        displayNumberOfYellowCardsOfTeam1(yellowCardsTeam1);
    }

    /**
     * Add 1 red card for Team1.
     */
    public void addOneRedCardForTeam1(View v) {
        redCardsTeam1 = redCardsTeam1 + 1;
        displayNumberOfRedCardsOfTeam1(redCardsTeam1);
    }

    /**
     * Displays the given score for Team 2.
     */
    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeam2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of fouls  for Team 2.
     */
    public void displayNumberOfFoulsForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numberFoulsTeam2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of yellow cards  for Team 2.
     */
    public void displayNumberOfYellowCardsOfTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numberYellowCardTeam2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of red cards  for Team 2.
     */
    public void displayNumberOfRedCardsOfTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numberRedCardTeam2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 1 goal for Team2.
     */
    public void addOneGoalTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Add 1 foul for Team2.
     */
    public void addOneFoulForTeam2(View v) {
        foulsTeam2 = foulsTeam2 + 1;
        displayNumberOfFoulsForTeam2(foulsTeam2);
    }

    /**
     * Add 1 yellow card for Team2.
     */
    public void addOneYellowCardForTeam2(View v) {
        yellowCardsTeam2 = yellowCardsTeam2 + 1;
        displayNumberOfYellowCardsOfTeam2(yellowCardsTeam2);
    }

    /**
     * Add 1 red card for Team2.
     */
    public void addOneRedCardForTeam2(View v) {
        redCardsTeam2 = redCardsTeam2 + 1;
        displayNumberOfRedCardsOfTeam2(redCardsTeam2);
    }

    /**
     * Reset the value of scoreTeam1, foulsTeam1, yellowCardsTeam1, redCardsTeam1, scoreTeam2,
     * foulsTeam2, yellowCardsTeam2, redCardsTeam2 by setting them to 0.
     */
    public void resetScore(View v) {
        scoreTeam1 = 0;
        foulsTeam1 = 0;
        yellowCardsTeam1 = 0;
        redCardsTeam1 = 0;
        scoreTeam2 = 0;
        foulsTeam2 = 0;
        yellowCardsTeam2 = 0;
        redCardsTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayNumberOfFoulsForTeam1(foulsTeam1);
        displayNumberOfYellowCardsOfTeam1(yellowCardsTeam1);
        displayNumberOfRedCardsOfTeam1(redCardsTeam1);
        displayForTeam2(scoreTeam2);
        displayNumberOfFoulsForTeam2(foulsTeam2);
        displayNumberOfYellowCardsOfTeam2(yellowCardsTeam2);
        displayNumberOfRedCardsOfTeam2(redCardsTeam2);
    }


}
