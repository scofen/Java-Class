public class NumberToWords {

    public static void main(String[] args) {
        System.out.println("****************Get Digit Count **********************");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println("**************** Reverse **********************");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("**************Number to Words    ************************");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);


    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int num = reverse(number),
        count = getDigitCount(number);
        String words = "";
        while (count > 0) {
            switch (num % 10) {
                case 0:
                    words += "Zero ";
                    break;
                case 1:
                    words += "One ";
                    break;
                case 2:
                    words += "Two ";
                    break;
                case 3:
                    words += "Three ";
                    break;
                case 4:
                    words += "Four ";
                    break;
                case 5:
                    words += "Five ";
                    break;
                case 6:
                    words += "Six ";
                    break;
                case 7:
                    words += "Seven ";
                    break;
                case 8:
                    words += "Eight ";
                    break;
                case 9:
                    words += "Nine ";
                    break;
            }
            num /= 10;
            count--;
        }
        System.out.println(words);
    }


    public static int reverse( int number ) {
        int last ;
        int reverse = 0  ;
        while( number != 0 ){
            last = number % 10 ;
            reverse = last  + reverse * 10 ;
            number = number / 10 ;
        }
        return reverse ;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            count++;
        } while ((number /= 10) > 0);
        return count;
    }
}