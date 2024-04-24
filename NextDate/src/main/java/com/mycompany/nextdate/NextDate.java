/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nextdate;

public class NextDate {
    public static void main(String[] args) {
        // Test the nextDate function
        int day = 31;
        int month = 12;
        int year = 2012;
        System.out.println("Next date: " + nextDate(day, month, year));
    }

    public static String nextDate(int day, int month, int year) {
        // Check if the input date is valid
        if (!isValidDate(day, month, year)) {
            return "Invalid date";
        }

        // Handle the case when the current date is the last day of the year
        if (day == 31 && month == 12) {
            return "1/1/" + (year + 1);
        }

        // Handle the case when the current date is the last day of a month
        if (day == daysInMonth(month, year)) {
            return "1/" + (month + 1) + "/" + year;
        }

        // Otherwise, return the next day
        return (day + 1) + "/" + month + "/" + year;
    }

    // Function to check if a given date is valid
    public static boolean isValidDate(int day, int month, int year) {
        if (year < 1812 || year > 2012 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    // Function to return the number of days in a month
    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    // Function to check if a given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

