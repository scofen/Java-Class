package com.scott;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minNumber = 2147483647;
        int maxNumber = -2147483647;

        while (true) {
            System.out.println("Enter your number ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();

                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }


                scanner.nextLine();
            } else {
                System.out.println("You entered an invalid number");
                break;
            }

        }
        System.out.println("The MAX number is " + maxNumber + " and the MIN number is " + minNumber);
        scanner.close();

    }

}