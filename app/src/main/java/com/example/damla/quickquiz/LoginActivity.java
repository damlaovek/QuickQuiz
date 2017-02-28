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
                Intent playGame = new Intent(getApplicationContext(), PlayGameActivity.class);
                startActivity(playGame);
                finish();
            }
        });

    }

}
