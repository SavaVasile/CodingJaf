package LeapYear;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        System.out.println("Please enter a leap year: ");
        Scanner scn = new Scanner(System.in);
        year = scn.nextInt();

    }
    public class Leap {
        private static final int GREGORIAN_START_YEAR = 1582;
        int year;

        public  boolean isLeap(final int year) {
            if (isDivisibleBy(year, 4)) {
                if (year < GREGORIAN_START_YEAR) {
                    return true;
                } else {
                    return !isDivisibleBy(year, 100) || isDivisibleBy(year, 400);
                }
            } else {
                return false;
            }
        }

        private boolean isDivisibleBy(int year, int divisor) {
            return year % divisor == 0;
        }
    }



}
