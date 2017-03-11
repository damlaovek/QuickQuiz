package com.example.damla.quickquiz;

import android.graphics.Color;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Damla on 26.2.2017.
 */
public class User {
    private static User ourInstance = new User();

    String nickname;
    int score;

    ArrayList<Integer> questionsAnswered=new ArrayList<Integer>();

    public ArrayList<Integer> getQuestionsAnswered() {
        return questionsAnswered;
    }

    public void setQuestionsAnswered(ArrayList<Integer> questionsAnswered) {
        this.questionsAnswered = questionsAnswered;
    }

    public static User getInstance() {
        return ourInstance;
    }

    private User() {
        for(int i=0;i<15;i++){
            questionsAnswered.add(Color.GRAY);
        }
    }

    public void deleteQuestionAnswered(){
        for(int i=0;i<15;i++){
            questionsAnswered.set(i,Color.GRAY);
        }
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
