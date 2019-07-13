public class ParsingVauesFromString {


    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        double number = Integer.parseInt(numberAsString);
        // double number = Double.parseDouble(numberAsString);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString + 1 = " + numberAsString);
        System.out.println("numberAsInt + 1 = " + number);
    }

}
