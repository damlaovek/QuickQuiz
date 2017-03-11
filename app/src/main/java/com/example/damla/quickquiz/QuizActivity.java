package com.example.damla.quickquiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends Activity implements View.OnClickListener{

    Question question;

    TextView questionText;
    Button a,b,c,d;

    int seconds=15;
    boolean running;
    boolean wasRunning;
    boolean questionAnswered=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        String questionId=getIntent().getStringExtra("questionId");
        question=Categories.getInstance().getQuestion(questionId);
        questionText=(TextView)findViewById(R.id.questionText);
        questionText.setText(question.getQuestionText());
        a=(Button)findViewById(R.id.a);
        b=(Button)findViewById(R.id.b);
        c=(Button)findViewById(R.id.c);
        d=(Button)findViewById(R.id.d);
        a.setText(question.getChoices().get(0));
        b.setText(question.getChoices().get(1));
        c.setText(question.getChoices().get(2));
        d.setText(question.getChoices().get(3));
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        running=true;
        runTimer();
        if(savedInstanceState!=null){
            seconds=savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
    }

    public void runTimer(){
        final TextView timeView= (TextView)findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run () {
                String time = String.format("%d", seconds);
                timeView.setText(time);
                if (running) {
                    seconds--;
                    if (seconds < 0) {
                        User.getInstance().getQuestionsAnswered().set(question.getId(), Color.BLUE);
                        if(isGameOver()) {
                            Intent gameOver = new Intent(getApplicationContext(), GameOverActivity.class);
                            startActivity(gameOver);
                            finish();
                            running = false;
                        }
                        else {
                            Intent returnPlayGame = new Intent(getApplicationContext(), PlayGameActivity.class);
                            startActivity(returnPlayGame);
                            finish();
                            running = false;
                        }
                    }
                }
                handler.postDelayed(this, 1000);

            }
        });
    }

    public Question getQuestion(){
        return question;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }


    @Override
    protected void onStop()
    {
        super.onStop();
        wasRunning=running;
        running = false;
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (wasRunning) {
            running = true;
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        running=true;
    }

    @Override
    public void onClick(View v) {
        Button clicked=(Button)findViewById(v.getId());
        if(clicked.getText().toString().equals(question.getCorrectAnswer())){
            running=false;
            User.getInstance().getQuestionsAnswered().set(question.getId(), Color.GREEN);
            User.getInstance().setScore(User.getInstance().getScore()+question.getScore());
        }else{
            running=false;
            User.getInstance().getQuestionsAnswered().set(question.getId(), Color.RED);
        }
        if(isGameOver()){
            Intent gameOver = new Intent(getApplicationContext(), GameOverActivity.class);
            startActivity(gameOver);
            finish();
        }else {
            Intent returnPlayGame = new Intent(getApplicationContext(), PlayGameActivity.class);
            startActivity(returnPlayGame);
            finish();
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        User.getInstance().getQuestionsAnswered().set(question.getId(), Color.BLUE);
        running=false;
        if(isGameOver()){
            Intent gameOver = new Intent(getApplicationContext(), GameOverActivity.class);
            startActivity(gameOver);
            finish();
        }else {
            Intent returnPlayGame = new Intent(getApplicationContext(), PlayGameActivity.class);
            startActivity(returnPlayGame);
            finish();
        }
    }

    public boolean isGameOver(){
        for (int i = 0; i < 15; i++) {
            if(User.getInstance().getQuestionsAnswered().get(i)==Color.GRAY){
                return false;
            }
        }
        return true;
    }

}
