public class CalcFeetAndInchesToCent {

    public static void main(String[] args) {

        double centimeters = calcFeetAndInchesToCentimeters(8, 4);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameter");
        }

        calcFeetAndInchesToCentimeters(157);


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double feetToCent = feet * 30.48;
            double inchesToCent = inches * 2.54;
            double centimeters = feetToCent + inchesToCent;
            System.out.println("Section 1 is " + feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
       if (inches >=0) {
       double feet = (int) inches / 12;
       double remainingInches = (int) inches % 12;
           System.out.println("Section 2 is " + inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
           return calcFeetAndInchesToCentimeters(feet, remainingInches);
       } else {
            return -1;


    }
}
}





