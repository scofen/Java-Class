public class LeapYear {

        public static void main(String[] args) {

            boolean isLeap = isLeapYear(-1600);
            System.out.println("Answer for -1600 is false = " + isLeap);

            isLeap = isLeapYear(1600);
            System.out.println("Answer for 1600 is true = " + isLeap);

            isLeap = isLeapYear(2017);
            System.out.println("Answer for 2017 is false = " + isLeap);

            isLeap = isLeapYear(2000);
            System.out.println("Answer for 2000 is true " + isLeap);

            isLeap = isLeapYear(1924);
            System.out.println("Answer for 1924 is true = " + isLeap);
        }

        public static boolean isLeapYear(int year){

            boolean result = false;
            int pickles = 0;

            if (year < 1 || year > 9999) {
                result = false;
            } else if (year % 100 == 0 && year % 400 != 0) {
                result = false;
            } else if (year % 4== pickles) {
                result = true;
            }

            return result;


        }
}
