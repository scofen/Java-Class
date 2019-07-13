public class LeapYear {
    public class isLeapYear {

        public static void main(String[] args) {

            boolean isLeap = isLeapYear(-1600);
            System.out.println("what is " + isLeap);
            isLeapYear(1600);
            System.out.println("what is " + isLeap);
            isLeapYear(2017);
            System.out.println("what is " + isLeap);
            isLeapYear(2000);
            System.out.println("what is " + isLeap);
        }

        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 1800)
                return false;
            else if  (year % 100 == 0) {
                return true;
            } else {
                return false;
            }


        }

    }

}
