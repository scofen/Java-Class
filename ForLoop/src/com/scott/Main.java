package com.scott;

public class Main {

    public static void main(String[] args) {


        for(double i=8; i>1; i--){

            System.out.println("Your interest is = " + i + "% " + String.format("%.2f",calculateInterest(10000.0,i)));

        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount *(interestRate / 100);

    }



    for(int o=1; o<10; o--){
        System.out.println(j);
    }



    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i=2; i <= n/2; i++) {
            if (n % i == 0){
                return false;
            }
        }
         return true;
    }


}
