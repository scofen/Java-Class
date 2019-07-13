public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));

    }

    private static boolean canPack(int bigCount, int smallCount, int goal) {

        int bigBagKilos = bigCount * 5;
        int totalKilos = 0;
        totalKilos = bigBagKilos + smallCount;

        // If anything is in the negative the value will return false.
        if (bigCount < 0 || smallCount < 0 && goal < 0) {
            return false;
        }

        // bigCount is = 5 and smallCount = 1


        // If bigCount is 0 and smallCount is greater than goal put true as it's allowed for the small
        // count to have more that the goal.
        if ((bigCount == 0) && (smallCount >= goal)) {
            return true;
        }
        //  If smallCount = 0 and bigCount >0 it must be equal to goal.
        if (smallCount == 0 && bigCount > 0) {
        if (bigBagKilos > goal) {
            return false;
        }

        // If the total kilos is greater than the goal and small = 0 insure only full bags are used.
        if (totalKilos > goal && smallCount == 0) {
            if ((bigCount % goal) == 0) {
                return true;
            }
        }

        if ((totalKilos > goal) && (goal % bigCount == 0)) {
            return true;
        }

        // If the total of bigCount & smallCount are == to goal
        if (totalKilos >= goal)
            return true;

        }

        return false;
    }
}

