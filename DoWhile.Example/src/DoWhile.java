public class DoWhile {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("Count to example 1 = " + count);
            count++;
        }
        System.out.println("************************************");

        for (count=1; count!=6; count++) {
            System.out.println("Count to example 2 = " + count);
        }

        System.out.println("************************************");
        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count to example 3 = " + count);
            count++;

        }
        System.out.println("************************************");

        count =1;
        do {
            System.out.println("Count to example 4 = " + count);
            count++;
        } while (count !=6);

        System.out.println("************************************");
        }


    }

