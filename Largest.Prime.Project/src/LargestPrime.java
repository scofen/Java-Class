public class LargestPrime {


    public static void main(String[] args) {
        System.out.println("The number is " + getLargestPrime(5));
        System.out.println("The number is " + getLargestPrime(-1));
        System.out.println("The number is " + getLargestPrime(31));
    }

    public static int getLargestPrime (int number){

        if (number <=1){
            return -1;
        }
        for (int i=2; i<number; i++){
            if (number % i == 0) {
                number /=i;
                i=1;

            }
        }
        return number;
        }

    }



