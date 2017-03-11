package com.example.damla.quickquiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayGameActivity extends Activity implements View.OnClickListener{

    TextView science, art, sport;
    ArrayList<Integer> buttonColors=new ArrayList<Integer>();
    ArrayList<Button> buttons=new ArrayList<Button>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        buttons.add((Button)findViewById(R.id.science500));
        buttons.add((Button)findViewById(R.id.science400));
        buttons.add((Button)findViewById(R.id.science300));
        buttons.add((Button)findViewById(R.id.science200));
        buttons.add((Button)findViewById(R.id.science100));
        buttons.add((Button)findViewById(R.id.art500));
        buttons.add((Button)findViewById(R.id.art400));
        buttons.add((Button)findViewById(R.id.art300));
        buttons.add((Button)findViewById(R.id.art200));
        buttons.add((Button)findViewById(R.id.art100));
        buttons.add((Button)findViewById(R.id.sport500));
        buttons.add((Button)findViewById(R.id.sport400));
        buttons.add((Button)findViewById(R.id.sport300));
        buttons.add((Button)findViewById(R.id.sport200));
        buttons.add((Button)findViewById(R.id.sport100));
        for (int i = 0; i <15 ; i++) {
            buttons.get(i).setOnClickListener(this);
        }
        buttonColors=User.getInstance().getQuestionsAnswered();
        for (int j = 0; j < 15; j++) {
            buttons.get(j).setBackgroundColor(buttonColors.get(j));
            disable(buttons.get(j));
        }
       if (savedInstanceState != null) {
            buttonColors=User.getInstance().getQuestionsAnswered();
           for (int i = 0; i < 15; i++) {
               buttons.get(i).setBackgroundColor(buttonColors.get(i));
           }
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    public void goQuestion(String questionId){
        Intent quiz=new Intent(getApplicationContext(),QuizActivity.class);
        quiz.putExtra("questionId",questionId);
        startActivity(quiz);
        finish();
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent returnLogin= new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(returnLogin);
        finish();
    }

    public void disable(Button b){
        int index=buttons.indexOf(b);
        if(buttonColors.get(index)!= Color.GRAY){
            b.setEnabled(false);
        }
    }
}
