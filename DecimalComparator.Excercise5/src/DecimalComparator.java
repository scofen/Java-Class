public class DecimalComparator {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175,3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a = a * 1000;
        b = b * 1000;
        int a1 = (int) a;
        int b1 = (int) b;
        System.out.println("A = " + a +"B = " + b);
        if (a1 == b1) {
            System.out.println("true");
            return true;
        } else
            System.out.println("false");
        return false;
    }
}


