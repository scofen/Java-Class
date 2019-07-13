package com.scott;

public class Main {

    public static void main(String[] args) {
        getDaysInMonth(12, 9999);

    }

    public static boolean isLeapYear(int year) {

        boolean result = false;

        if (year < 1 || year > 10000) {
            result = false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            result = false;
        } else if (year % 4 == 0) {
            result = true;
        }
        return result;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;

                case 2:
                    if (isLeapYear(year) == true) {
                        return 29;
                    } else {
                        return 28;
                    }

            }
        }
        return -1;
    }
}










