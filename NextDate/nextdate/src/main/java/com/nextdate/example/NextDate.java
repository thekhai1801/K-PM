package com.nextdate.example;

public class NextDate {
    
    public static String nextDate(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            return "Invalid date";
        }

        if (day == 31 && month == 12) {
            return "01/01/" + (year + 1);
        }

        if (day == 31 || (day == 30 && !isThirtyDayMonth(month)) || (day == 29 && month == 2 && !isLeapYear(year))) {
            return String.format("01/%02d/%d", month + 1, year);
        }

        if (day == 29 && month == 2) {
            return "01/03/" + year;
        }

        return String.format("%02d/%02d/%d", day + 1, month, year);
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (year < 1812 || year > 2012 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            return false;
        }
        if (day == 30 && month == 2) {
            return false;
        }
        if (day == 29 && month == 2 && !isLeapYear(year)) {
            return false;
        }
        return true;
    }

    private static boolean isThirtyDayMonth(int month) {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
