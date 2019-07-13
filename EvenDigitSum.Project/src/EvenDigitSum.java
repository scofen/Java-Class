public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println("The final number is " + getEvenDigitSum(225516186));
    }

    public static int getEvenDigitSum (int number) {

        int digit = 0;
        int sum = 0;

        if (number <0){
            return -1;
        }

        while ( number > 0){
            digit = number % 10;
                if (digit % 2 == 0){
                    sum += digit;
                }

               number /= 10;

                }
        return sum;
        }

    }


