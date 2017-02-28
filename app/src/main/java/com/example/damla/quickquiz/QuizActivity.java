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
        question=Categories.getInstance().getQuestion(questionId);
        a.setText(question.getChoices().get(0));
        b.setText(question.getChoices().get(1));
        c.setText(question.getChoices().get(2));
        d.setText(question.getChoices().get(3));
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
    }

    public Question getQuestion(){
        return question;
    }


    @Override
    public void onClick(View v) {
        Button clicked=(Button)findViewById(v.getId());
        if(clicked.getText().toString().equals(question.getCorrectAnswer())){

        }
    }
}
