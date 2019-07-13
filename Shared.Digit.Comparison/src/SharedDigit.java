public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));



    }

    public static boolean hasSharedDigit (int a, int b) {

        if ((a <10 || a >99) || (b<10 || b>99)) {
            return false;
        }
        int n1 = a / 10;
        int n2 = a % 10;
        int n3 = b / 10;
        int n4 = b % 10;

        if (n1 == n3 || n2 == n4 || n4 == n1 || n2 == n3 ) {

            return true;

        }  else {

            return false;
        }

    }

}
