package com.comanagersunite.comanagerchecklist;

import java.util.Random;

/**
 * Created by Fark11Fark11 on 2/19/2015.
 */
public class QuestionBook {

    public String[] mQuestions = {
            "Have you brushed your teeth?",
            "Have you washed your car?",
            "Have you exercised today?",
            "Have you called your sons?",
            "Have you checked your emails?",
            "Have you checked your grades?",
            "Have you had a great day?",
            "Have you built another app?",
            "Have you started your car?",
            "Have you smiled today?",
            "Have you called your friends?"};

    public String getQuestion() {




        String haveYou = "";
        // Randomly select a task
        Random randomGenerator = new Random(); // Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mQuestions.length);

        haveYou = mQuestions[randomNumber];

        return haveYou;
    }
}
