package com.example.myscorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int score_B = 0;
    TextView tvScoreA, tvScoreB;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScoreA = findViewById(R.id.tv_score_A);

        tvScoreB = findViewById(R.id.tv_score_B);
        b1 = findViewById(R.id.btn1);


    }

    public void addOne(View view) {
        score = score + 1;
        tvScoreA.setText("" + score);
    }

    public void addThree(View view) {
        score = score + 3;
        tvScoreA.setText("" + score);
    }

    public void addFive(View view) {
        score = score + 5;
        tvScoreA.setText("" + score);
    }


    public void B_addOne(View view) {
        score_B = score_B + 1;
        tvScoreB.setText("" + score_B);
    }

    public void B_addThree(View view) {
        score_B = score_B + 3;
        tvScoreB.setText("" + score_B);
    }

    public void B_addFive(View view) {
        score_B = score_B + 5;
        tvScoreB.setText("" + score_B);
    }

    public void reset(View view) {
        score_B = 0;
        score = 0;
        tvScoreA.setText("" + score);
        tvScoreB.setText("" + score_B);
    }


}
