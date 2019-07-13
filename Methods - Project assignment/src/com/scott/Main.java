package com.scott;

public class Main {

    public static void main(String[] args) {


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Joe",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jackson",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Nick",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Alex",highScorePosition);

    }


    public static void displayHighScorePosition (String playerName, int position) {
        System.out.println(playerName + " managed to get into position "+ position + " on the high score table");


        }
    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if  (playerScore >= 500) {
            return 2;
        } else if  (playerScore >= 100) {
            return 3;
        }else{
            return 4;

        }


    }
}
