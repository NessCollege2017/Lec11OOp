package edu.tomer.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Trivia q1 = new Trivia("Who was the first President of Israel?",
                               new String[]{"Weizman", "Peres", "Navon", "Ben-Gurion"},
                               0);

        Trivia q2 = new Trivia("What was the prior name of Shimon Peres?",
                                new String[]{"Perszon", "Persky", "Persman", "Parosh"},
                                1);



        Trivia[] deck = {q1, q2};

        for (Trivia question : deck) {
            question.showQuestion();
            question.showAnswers();
            question.checkAnswer();
        }


        String s = "Hello";
        boolean h = s.startsWith("H");
        System.out.println(h);

        boolean b = s.endsWith("?");


    }


















        /*
        Student moshe = new Student("Moshe", "Doe", "030500505", "0505005055", "Moshe@gmail.com", "Ramat Hayal 5", 20);
        Student student = new Student();
        */
//
//        Scanner scanner = new Scanner("Tomer has a little lamb");
//        scanner.useDelimiter(" ");
//        while (scanner.hasNext()) {
//            String next = scanner.next();
//            System.out.println(next);
//        }


}
