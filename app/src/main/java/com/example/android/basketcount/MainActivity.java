package com.example.android.basketcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TeamAScore,TeamBScore;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Points3A(View view){
        TeamAScore=TeamAScore+3;
       displayForTeamA(TeamAScore);

    }

    public void Points2A(View view){
        TeamAScore=TeamAScore+2;
        displayForTeamA(TeamAScore);

    }

    public void FreeThrowA(View view){
        TeamAScore=TeamAScore+1;
        displayForTeamA(TeamAScore);

    }

    public void Points3B(View view){
        TeamBScore=TeamBScore+3;
        displayForTeamB(TeamBScore);

    }

    public void Points2B(View view){
        TeamBScore=TeamBScore+2;
        displayForTeamB(TeamBScore);

    }

    public void FreeThrowB(View view){
        TeamBScore=TeamBScore+1;
        displayForTeamB(TeamBScore);

    }

    public void Reset(View view){
        displayForTeamA(0);
        displayForTeamB(0);
        TeamAScore=0;
        TeamBScore=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
