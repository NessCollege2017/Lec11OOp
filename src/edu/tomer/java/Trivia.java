package edu.tomer.java;

import java.util.Scanner;

/**
 * Created by Android2017 on 10/02/2017.
 */
public class Trivia {
    //Properties:
    String question;
    String[] possibleAnswers;
    int correctAnsIndex;

    //Empty Constructor (does not take any parameters:)
    public Trivia() {
        this.question = IO.getString("Enter the question:");
        this.possibleAnswers = IO.getStringArray("Enter the next Answer:", 4);
        this.correctAnsIndex = IO.getInt("Enter the correct answer index:");
    }

    //Full Constructor:
    public Trivia(String question, String[] possibleAnswers, int correctAnsIndex) {
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.correctAnsIndex = correctAnsIndex;
    }

    void showQuestion(){
        System.out.println(question);
    }

    void showAnswers(){
        for (int i = 0; i < possibleAnswers.length; i++) {
            System.out.printf("%d) %s\n" , i + 1, possibleAnswers[i]);
        }
    }

    boolean checkAnswer(){
        int userAns = IO.getInt("Enter your answer:", 1, 4);
        userAns-=1;
        if (userAns == correctAnsIndex){
            System.out.println("Correct");
            return true;
        }else {
            System.out.println("Wrong, the correct answer is: " + possibleAnswers[correctAnsIndex]);
            return false;
        }
    }
}
