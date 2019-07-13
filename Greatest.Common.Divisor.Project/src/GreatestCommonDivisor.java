public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println("The final number is = " + getGreatestCommonDivisor(25,15));


    }

    public static int getGreatestCommonDivisor (int a, int b) {

        if (a < 10 || b < 10){
            return -1;
        }

        int i = 1;
        int number =0;

        while (i <= a && i <= b){
            if ((a % i == 0) && (b % i == 0)) {
                number = i;
            }
            i++;
        }
       return number;
    }
}
