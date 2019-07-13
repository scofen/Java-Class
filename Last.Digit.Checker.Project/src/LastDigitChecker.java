public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(777,771,77));
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        if ((a < 10 || a >= 1000) || (b < 10 || b >= 1000) || (c < 10 || c >= 1000)) {
            return false;
        }

        n1 = a % 10;
        n2 = b % 10;
        n3 = c % 10;


        if ((n1 == n2) || (n2 == n3) || (n1 == n3)) {

            return true;

        } else {

            return false;

        }

    }
    public static boolean isValid (int d) {

        if (d <10 || d >1000) {
            return false;
        } else {
            return true;
        }

    }
}

