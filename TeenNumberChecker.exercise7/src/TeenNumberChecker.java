public class TeenNumberChecker {

    public static void main(String[] args) {

        hasTeen(9,99,19);
        hasTeen(23,15,42);
        hasTeen(22,23,34);

        isTeen(9);
        isTeen(13);
    }

    public static boolean hasTeen(int hasTeen1, int hasTeen2, int hasTeen3) {

        if (hasTeen1 >=13 && hasTeen1 < 19 || hasTeen2 >=13 && hasTeen2 <=19 || hasTeen3 >=13 && hasTeen3 <=19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int teen) {

        if (teen >=13 && teen < 19) {
        return true;
    } else {
        return false;
    }
    }


}
