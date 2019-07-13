public class evenNumber {


    public static void main(String[] args) {
// Example 1
//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if (isEven(number)) {
//                System.out.println(number);
//                continue;
//            }
//
//        }
// Example 2
        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;
        while (number <= finishNumber) {
            number++;
            if (isEven(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumberFound++;
            if (evenNumberFound >=5){
                break;
            }
        }
        System.out.println("Total even number found " + evenNumberFound);
    }

    public static boolean isEven (int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        } else {
            return false;

        }
    }




}

