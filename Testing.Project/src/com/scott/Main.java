package com.scott;

public class Main {

    public static void main(String[] args) {

        System.out.println("The final number is " + getEvenDigitSum(1223));
    }

    public static int getEvenDigitSum(int number){
        int Digit    = 0;
        int sumDigit = 0;
        if (number < 0 ){
            return -1;
        }

        if((number/10 < 10) && ((number/10)%2 == 0)){
            return number;
        }

        if((number/10 < 10) && ((number/10)%2 != 0)){
            return -1;
        }

        while(number >=0){
            Digit = number % 10;
            if((Digit % 2 == 0)){
                sumDigit += Digit;
            }

            number /=10;
            if(number < 10){
                if((number % 2 == 0)){
                    sumDigit += number;
                }
                break;
            }
        }
        return sumDigit;
    }

}
