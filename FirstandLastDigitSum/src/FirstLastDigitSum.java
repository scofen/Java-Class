public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println("The answer is " + sumFirstAndLastDigit(5));

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0)
            return -1;

            int lastDigit = number;

            lastDigit = number % 10;

            while ((number / 10)>0) {
                number = number / 10;
                if (number == 1) {
                    break;
                }
            }

            return number + lastDigit;

    }


}