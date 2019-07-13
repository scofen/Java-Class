package com.scott;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int number = 0;

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                sum+=scanner.nextInt();
                number++;

            } else {

                average=Math.round(sum/ ((double) number));
                System.out.println("SUM = "+sum+" "+"AVG = "+ average);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

    }

}