package com.example.damla.quickquiz;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;

/**
 * Created by Damla on 28.2.2017.
 */

public class Categories {

    public static Categories ourInstance = new Categories();

    public static Categories getInstance(){return ourInstance;}

    private Categories(){}

    public Question getQuestion(String questionID) {
        String questionText="";
        int score=0;
        List<String> choices=new ArrayList<String>();
        String correctAnswer="";
        int id=-1;
        switch (questionID) {
            case "science100":
                questionText = "What does a light-year measure?";
                score = 100;
                choices.add("Brightness");
                choices.add("Time");
                choices.add("Distance");
                choices.add("Weight");
                correctAnswer = "Distance";
                id=4;
                break;
            case "science200":
                questionText = "Which of these terms is defined as the study of how the positions of stars and planets can influence human behavior?";
                score = 200;
                choices.add("Astrology");
                choices.add("Alchemy");
                choices.add("Astronomy");
                choices.add("Meteorology");
                correctAnswer = "Astrology";
                id=3;
                break;
            case "science300":
                questionText = "Which of these elements is needed to make nuclear energy and nuclear weapons?";
                score = 300;
                choices.add("Sodium chloride");
                choices.add("Uranium");
                choices.add("Nitrogen");
                choices.add("Carbon dioxide");
                correctAnswer = "Uranium";
                id=2;
                break;
            case "science400":
                questionText = "The loudness of a sound is determined by what property of a sound wave?";
                score = 400;
                choices.add("Frequency");
                choices.add("Wavelength");
                choices.add("Velocity");
                choices.add("Amplitude");
                correctAnswer = "Amplitude";
                id=1;
                break;
            case "science500":
                questionText = "Which kind of waves are used to make and receive cellphone calls?";
                score = 500;
                choices.add("Radio waves");
                choices.add("Visible light waves");
                choices.add("Sound waves");
                choices.add("Gravity waves");
                correctAnswer = "Radio waves";
                id=0;
                break;
            case "sport100":
                questionText = "With which sport is the 'Choudhury Trophy' associated?";
                score = 100;
                choices.add("Golf");
                choices.add("Circumnavigation of the earth by car");
                choices.add("Formula One racing");
                choices.add("Buggy-Jumping");
                correctAnswer = "Circumnavigation of the earth by car";
                id=14;
                break;
            case "sport200":
                questionText = "Which English Premier League football club supporters traditionally sing the song ‘You'll Never Walk Alone’ before commencement of the match?";
                score = 200;
                choices.add("Chelsea FC");
                choices.add("Manchester United");
                choices.add("Liverpool FC");
                choices.add("Leeds United FC");
                correctAnswer = "Liverpool FC";
                id=13;
                break;
            case "sport300":
                questionText = "Which 2 male tennis players have the most Wimbledon singles titles, seven each?";
                score = 300;
                choices.add("Roger Federer and Andre Agassi");
                choices.add("Roger Federer and Raphael Nadal");
                choices.add("Pete Sampras and Andre Agassi");
                choices.add("Roger Federer and Pete Sampras");
                correctAnswer = "Roger Federer and Pete Sampras";
                id=12;
                break;
            case "sport400":
                questionText = "Which Australian was selected by the Milwaukee Bucks with the first overall pick in the 2005 National Basketball Association (NBA) Draft?";
                score = 400;
                choices.add("Mark Bradtke");
                choices.add("Andrew Bogut");
                choices.add("Patrick Mills");
                choices.add("Luke Schenscher");
                correctAnswer = "Andrew Bogut";
                id=11;
                break;
            case "sport500":
                questionText = "At 9.58 seconds, Usain Bolt holds the record for the fastest time in the 100 metre sprint, but which sprinter holds the female record with 10.49 seconds?";
                score = 500;
                choices.add("Marion Jones");
                choices.add("Shelly-Ann Fraser-Pryce");
                choices.add("Florence Griffith-Joyner");
                choices.add("Carmelita Jeter");
                correctAnswer = "Florence Griffith-Joyner";
                id=10;
                break;
            case "art100":
                questionText = "Early photographers made their images on which of these materials?";
                score = 100;
                choices.add("Stone");
                choices.add("Glass");
                choices.add("Paper");
                choices.add("Plastic");
                correctAnswer = "Glass";
                id=9;
                break;
            case "art200":
                questionText = "Which one of these is not a well-known Indian sculptor?";
                score = 200;
                choices.add("Ramkinkar Baij");
                choices.add("Krishna Reddy");
                choices.add("Henry Moore");
                choices.add("Kumaradeva");
                correctAnswer = "Henry Moore";
                id=8;
                break;
            case "art300":
                questionText = "What did I.M. Pei design outside the Louvre, in Paris?";
                score = 300;
                choices.add("Obelisk");
                choices.add("Sarcophagus");
                choices.add("Ziggurat");
                choices.add("Pyramid");
                correctAnswer = "Pyramid";
                id=7;
                break;
            case "art400":
                questionText = "Who designed the Vietnam Veterans Memorial?";
                score = 400;
                choices.add("Maya Lin");
                choices.add("Frank Llyod Wright");
                choices.add("I.M. Pei");
                choices.add("Frank Gehry");
                correctAnswer = "Maya Lin";
                id=6;
                break;
            case "art500":
                questionText="What does the Venus of Brassempouy represent?";
                score = 500;
                choices.add("A human figure");
                choices.add("An old man");
                choices.add("A woman's body");
                choices.add("An angel");
                correctAnswer = "A woman's body";
                id=5;
                break;
        }
        Question myQuestion=new Question(questionText, score, choices, correctAnswer,id);
        return myQuestion;
    }
}
