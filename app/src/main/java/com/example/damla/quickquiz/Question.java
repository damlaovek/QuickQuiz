package com.example.damla.quickquiz;

import java.util.List;

/**
 * Created by Damla on 26.2.2017.
 */

public class Question {
    private String id;
    private int score;
    private String questionText;
    private List<String> choices;
    private String correctAnswer;

    public Question(String id, int score, List<String> choices,String correctAnswer){
        this.id=id;
        this.score=score;
        this.choices=choices;
        this.correctAnswer=correctAnswer;
    }


    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
