package com.example.damla.quickquiz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class GameOverActivity extends Activity {

    TextView nick, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        nick=(TextView)findViewById(R.id.nick);
        nick.setText(User.getInstance().getNickname());
        score=(TextView)findViewById(R.id.score);
        score.setText(""+User.getInstance().getScore());
    }
}
