public class EqualSumChecker {

    public static void main(String[] args) {

        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        int d = a + b;
        if (c == d) {
            return true;
        } else {
            return false;
        }
    }
}

