public class MinutesToYearsDaysCalculator {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

    printYearsAndDays(525600);
    printYearsAndDays(1051200);
    printYearsAndDays(561600);
    printYearsAndDays(1440);
    printYearsAndDays(581760);
    printYearsAndDays(525600);

    }

    public static void printYearsAndDays (long minutes) {

        if (minutes <0){
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d" );
        }

    }
}
