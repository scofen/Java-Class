package com.scott;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
	boolean secondlevelGameOver = true;
	int score = 200;
	int secondScore = 10000;
	int bonus = 100;
	int secondBonus = 200;
	int levelCompleted = 5;
	int secondlevelCompleted = 8;

//	if (score < 5000 && score >1000){
//			System.out.println("Your score was less 5000 but greater than 1000");
//		} else if (score < 1000) {
//			System.out.println("Your score was less than 1000");
//		} else {
//		System.out.println("You win");
//	}


	if (gameOver == true) {
		int finalScore = score + (levelCompleted * bonus);
		finalScore += 1000;
		System.out.println("You're final score was " + finalScore);
	}

	if (secondlevelGameOver == true) {
		int finalScore = secondScore + (secondlevelCompleted * secondBonus);
		System.out.println("You're final score was " + finalScore);
		}

	if (score >5000) {
		System.out.println("Your score was >= to 5000");
	} else if (score < 1000 && score > 500) {
		System.out.println("Your score was <1000 but >= 500");
	} else {
		System.out.println("your score was <500");
	}


    }
}
