package com.scott;

public class Main {

    public static void main(String[] args) {

       printDayOfTheWeek(1);
       printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(8);

    }

    public static void printDayOfTheWeek (int day){

    switch(day) {
        case 1:
            System.out.println("Today is Monday");
            break;
        case 2:
            System.out.println("Today is Tuesday");
            break;
        case 3:
            System.out.println("Today is Wednesday");
            break;
        case 4:
            System.out.println("Today is Thursday");
            break;
        case 5:
            System.out.println("Today is Friday");
            break;
        case 6:
            System.out.println("Today is Saturday");
            break;
        case 7:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("Invalid Day");
            break;

    }

        }


}
