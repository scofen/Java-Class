package com.scott;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("My high score was " + highScore);

        calculateScore(true, 10000, 8, 200);
        System.out.println("My high score was " + highScore);
    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
                    } else {
            int finalScore = -1;
            return finalScore;
        }


    }



}
