package com.example.damla.quickquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.id;

public class PlayGameActivity extends AppCompatActivity implements View.OnClickListener{

    TextView science, art, sport;
    Button science100, science200, science300, science400, science500;
    Button art100, art200, art300, art400, art500;
    Button sport100, sport200, sport300, sport400, sport500;

    Button k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        science100.setOnClickListener(this);
        science200.setOnClickListener(this);
        science300.setOnClickListener(this);
        science400.setOnClickListener(this);
        science500.setOnClickListener(this);
        art100.setOnClickListener(this);
        art200.setOnClickListener(this);
        art300.setOnClickListener(this);
        art400.setOnClickListener(this);
        art500.setOnClickListener(this);
        sport100.setOnClickListener(this);
        sport200.setOnClickListener(this);
        sport300.setOnClickListener(this);
        sport400.setOnClickListener(this);
        sport500.setOnClickListener(this);
    }

    public void goQuestion(String questionId){
        Intent quiz=new Intent(getApplicationContext(),QuizActivity.class);
        quiz.putExtra("questionId",questionId);
        startActivity(quiz);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.science100:
                goQuestion("science100");
            case R.id.science200:
                goQuestion("science200");
            case R.id.science300:
                goQuestion("science300");
            case R.id.science400:
                goQuestion("science400");
            case R.id.science500:
                goQuestion("science500");
            case R.id.art100:
                goQuestion("art100");
            case R.id.art200:
                goQuestion("art200");
            case R.id.art300:
                goQuestion("art300");
            case R.id.art400:
                goQuestion("art400");
            case R.id.art500:
                goQuestion("art500");
            case R.id.sport100:
                goQuestion("sport100");
            case R.id.sport200:
                goQuestion("sport200");
            case R.id.sport300:
                goQuestion("sport300");
            case R.id.sport400:
                goQuestion("sport400");
            case R.id.sport500:
                goQuestion("sport500");
        }
    }
}
