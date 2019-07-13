public class BarkingDog {

    public static void main(String[] args) {

        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == false || (hourOfDay > 23 || hourOfDay < 0))
            return false;
        if (hourOfDay <8 || hourOfDay >22 ) {
            return true;
        } else {
            return true;
        }
    }
}

