public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println("The answer is " + isPalindrome(101));
    }

    public static boolean isPalindrome (int number){

        int remainder = 0;
        int reverse = 0;
        int palindrome = number;


        while (palindrome != 0){
            remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
            if (number == reverse) {
                return true;
            }

        }

        return false;
    }


}
