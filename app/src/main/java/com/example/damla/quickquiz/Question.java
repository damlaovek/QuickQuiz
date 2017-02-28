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

    public Question(String id){
        this.id=id;
        switch(id){
            case "science100":
                questionText="";
                score=100;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "science200":
                questionText="";
                score=200;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "science300":
                questionText="";
                score=300;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "science400":
                questionText="";
                score=400;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "science500":
                questionText="";
                score=500;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "sport100":
                questionText="";
                score=100;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "sport200":
                questionText="";
                score=200;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "sport300":
                questionText="";
                score=300;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "sport400":
                questionText="";
                score=400;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "sport500":
                questionText="";
                score=500;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "art100":
                questionText="";
                score=100;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "art200":
                questionText="";
                score=200;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "art300":
                questionText="";
                score=300;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "art400":
                questionText="";
                score=400;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
            case "art500":
                questionText="";
                score=500;
                choices.add("");
                choices.add("");
                choices.add("");
                choices.add("");
                correctAnswer="";
        }

    }

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }
}
