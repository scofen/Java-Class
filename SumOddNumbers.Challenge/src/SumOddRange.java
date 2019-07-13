public class SumOddRange {

    public static void main(String[] args) {
      int total = sumOdd(1,10);
        System.out.println(total);

        total = sumOdd(-1,100);
        System.out.println(total);

        total = sumOdd(100,100);
        System.out.println(total);

        total = sumOdd(13,13);
        System.out.println(total);

        total = sumOdd(100,-100);
        System.out.println(total);

        total = sumOdd(100,1000);
        System.out.println(total);

    }

    public static int sumOdd (int start, int end){
        int count = 0;
        if (start <0 || end <0)
            return -1;
        if (start > end)
            return -1;
        for (int i=start; i<=end; i++){
            if (isOdd(i)) {
                count+= i;
            }
        }
        return count;
    }

    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;

        }
    }




}
