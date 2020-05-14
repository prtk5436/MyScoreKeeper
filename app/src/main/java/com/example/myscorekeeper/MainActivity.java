package com.example.myscorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int score_B = 0;
    TextView tv_score, tv_score_B;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_score = findViewById(R.id.tv_score);

        tv_score_B = findViewById(R.id.tv_score_B);
        b1 = findViewById(R.id.btn1);


    }

    public void addOne(View view) {
        score = score + 1;
        tv_score.setText("" + score);
    }

    public void addThree(View view) {
        score = score + 3;
        tv_score.setText("" + score);
    }

    public void addFive(View view) {
        score = score + 5;
        tv_score.setText("" + score);
    }


    public void B_addOne(View view) {
        score_B = score_B + 1;
        tv_score_B.setText("" + score_B);
    }

    public void B_addThree(View view) {
        score_B = score_B + 3;
        tv_score_B.setText("" + score_B);
    }

    public void B_addFive(View view) {
        score_B = score_B + 5;
        tv_score_B.setText("" + score_B);
    }

    public void reset(View view) {
        score_B = 0;
        score = 0;
        tv_score.setText("" + score);
        tv_score_B.setText("" + score_B);
    }


}
