package com.example.damla.quickquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayGameActivity extends Activity implements View.OnClickListener{

    TextView science, art, sport;
    Button science100=(Button)findViewById(R.id.science100);
    Button science200=(Button)findViewById(R.id.science200);
    Button science300=(Button)findViewById(R.id.science300);
    Button science400=(Button)findViewById(R.id.science400);
    Button science500=(Button)findViewById(R.id.science500);
    Button sport100=(Button)findViewById(R.id.sport100);
    Button sport200=(Button)findViewById(R.id.sport200);
    Button sport300=(Button)findViewById(R.id.sport300);
    Button sport400=(Button)findViewById(R.id.sport400);
    Button sport500=(Button)findViewById(R.id.sport500);
    Button art100=(Button)findViewById(R.id.art100);
    Button art200=(Button)findViewById(R.id.art200);
    Button art300=(Button)findViewById(R.id.art300);
    Button art400=(Button)findViewById(R.id.art400);
    Button art500=(Button)findViewById(R.id.art500);
    ArrayList<Integer> buttonColors=new ArrayList<Integer>();
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
        if (savedInstanceState != null) {
            buttonColors=User.getInstance().getQuestionsAnswered();
            science100.setBackgroundColor(buttonColors.get(4));
            science200.setBackgroundColor(buttonColors.get(3));
            science300.setBackgroundColor(buttonColors.get(2));
            science400.setBackgroundColor(buttonColors.get(1));
            science500.setBackgroundColor(buttonColors.get(0));
            art100.setBackgroundColor(buttonColors.get(9));
            art200.setBackgroundColor(buttonColors.get(8));
            art300.setBackgroundColor(buttonColors.get(7));
            art400.setBackgroundColor(buttonColors.get(6));
            art500.setBackgroundColor(buttonColors.get(5));
            sport100.setBackgroundColor(buttonColors.get(14));
            sport200.setBackgroundColor(buttonColors.get(13));
            sport300.setBackgroundColor(buttonColors.get(12));
            sport400.setBackgroundColor(buttonColors.get(11));
            sport500.setBackgroundColor(buttonColors.get(10));
        }
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
                break;
            case R.id.science200:
                goQuestion("science200");
                break;
            case R.id.science300:
                goQuestion("science300");
                break;
            case R.id.science400:
                goQuestion("science400");
                break;
            case R.id.science500:
                goQuestion("science500");
                break;
            case R.id.art100:
                goQuestion("art100");
                break;
            case R.id.art200:
                goQuestion("art200");
                break;
            case R.id.art300:
                goQuestion("art300");
                break;
            case R.id.art400:
                goQuestion("art400");
                break;
            case R.id.art500:
                goQuestion("art500");
                break;
            case R.id.sport100:
                goQuestion("sport100");
                break;
            case R.id.sport200:
                goQuestion("sport200");
                break;
            case R.id.sport300:
                goQuestion("sport300");
                break;
            case R.id.sport400:
                goQuestion("sport400");
                break;
            case R.id.sport500:
                goQuestion("sport500");
                break;
        }
    }
}
