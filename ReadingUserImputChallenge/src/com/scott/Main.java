package com.scott;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int count = 0;
        for (int i=1; i<11;i++){
            int order = count + 1;
            System.out.println("Enter number #" + i + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                count = count + number;

            } else {
                System.out.println("You entered an invalid number");

            }
            scanner.nextLine();
            }
        System.out.println("The total count is " + count);

    scanner.close();
    }
}
