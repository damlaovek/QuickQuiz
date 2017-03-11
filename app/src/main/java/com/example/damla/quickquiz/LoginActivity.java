package com.example.damla.quickquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    EditText nickname;
    Button play;
    boolean noName=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        play = (Button)findViewById(R.id.play);
        nickname = (EditText)findViewById(R.id.nickName);

        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                User.getInstance().setNickname(nickname.getText().toString());
                User.getInstance().deleteQuestionAnswered();
                User.getInstance().setScore(0);
                Intent playGame = new Intent(getApplicationContext(), PlayGameActivity.class);
                startActivity(playGame);
                finish();
            }
        });
        nickname.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(noName) {
                    nickname.setText("");
                    noName = false;
                }
            }
        });
    }
}

