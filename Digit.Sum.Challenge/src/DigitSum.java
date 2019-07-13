public class DigitSum {

    public static void main(String[] args) {

        System.out.println("The final sum is " + sumDigits(-1111));
    }

    private static int sumDigits (int number){

        int sum = 0;
        int digit = 0;
        if (number <10) {
            return -1;
        }
        // 125 -> 125 / 10 = 12 -> * 10 = 120 - 120 = 5
        while (number >0) {
            digit = number % 10;
            sum = sum + digit;
            number = number /10;


        }
        return sum;
    }



}
