package com.scott;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;

        result = result - 1;
        System.out.println(result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = "+ result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("The result is now " + result);
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result -= 10;
        System.out.println(result);

        result /= 10;
        System.out.println(result);

       boolean isAlien = false;
       if (isAlien == true);
        System.out.println("It is not an alien");

        int topScore = 10;
        if (topScore <= 100)
            System.out.println("You got the high score!");

        int secondTopscore = 20;
        if ((topScore > secondTopscore) && (topScore < 100))
            System.out.println("topScore > secondTopscore and topScore < 100");

        if ((topScore > 90) || (secondTopscore >= 100));
            System.out.println("One of these are true");

        int newValue = 50;
        if (newValue == 50)
        System.out.println("This is an error");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("IsCar is really True");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        System.out.println("wasCar is true");
        System.out.println(isCar);

        double pickles1 = 20;
        double pickles2 = 80;
        double totalPickles = (pickles1 + pickles2) * 25;
        System.out.println("totalPickles = " + totalPickles);
        double pickleRemainder = totalPickles % 40;
        System.out.println("Reminder is " + pickleRemainder);
        if (pickleRemainder <= 20)
        System.out.println("The total was over the limit");















    }
}
