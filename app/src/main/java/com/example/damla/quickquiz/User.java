package com.example.damla.quickquiz;

import android.widget.TextView;

/**
 * Created by Damla on 26.2.2017.
 */
public class User {
    private static User ourInstance = new User();

    String nickname;
    int score;

    public static User getInstance() {
        return ourInstance;
    }

    private User() {
    }

    public void setNickname(String nickname){
        this.nickname=nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
