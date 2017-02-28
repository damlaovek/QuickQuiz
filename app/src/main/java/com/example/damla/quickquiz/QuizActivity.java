package com.example.damla.quickquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    Question question;

    Button a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        String questionId=getIntent().getStringExtra("questionId");
        question=new Question(questionId);
    }

    public Question getQuestion(){
        return question;
    }


    @Override
    public void onClick(View v) {

    }
}
