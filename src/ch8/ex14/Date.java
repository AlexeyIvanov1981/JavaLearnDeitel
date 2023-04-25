package ch8.ex14;

import java.util.Arrays;

public class Date {
    private int month;
    private int day;
    private int year;
    private int numberDayInYear;
    private String monthString;
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final Month[] MONTHS = {Month.JAN, Month.FEB, Month.MAR, Month.APR, Month.JUN, Month.JUL, Month.AUG,
            Month.SEP, Month.OCT, Month.NOV, Month.DEC};
    private static final String[] MonthsForString = {"JAN", "FEB", "MAR", "APR", "JUN", "JUL",
            "AUG", "SEP", "OCT", "NOV", "DEC"};


    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(String monthString, int day, int year) {
        switch (monthString) {
            case ("JAN"), ("FEB"), ("MAR"), ("APR"), ("JUN"), ("JUL"), ("AUG"), ("SEP"), ("OCT"), ("NOV"), ("DEC") ->
                    this.monthString = monthString;
            default -> throw new IllegalArgumentException("You entered incorrect month");
        }
        if (day <= 0 || day > 365)
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        this.year = year;
        this.day = day;

    }

    public Date(int numberDayInYear, int year) {
        if (numberDayInYear < 1 || numberDayInYear > 364) {
            throw new IllegalArgumentException("You entered incorrect day, day should be in range 0 - 365");
        }
        if (year < 0) {
            throw new IllegalArgumentException("You entered incorrect year");
        }
        this.year = year;
        this.numberDayInYear = numberDayInYear;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberDayInYear() {
        return numberDayInYear;
    }

    public void setNumberDayInYear(int numberDayInYear) {
        this.numberDayInYear = numberDayInYear;
    }

    public String getMonthString() {
        return monthString;
    }

    public void setMonthString(String monthString) {
        this.monthString = monthString;
    }


    public String toStringForMonthString() {
        return String.format("%s %d, %d", getMonthString(), getDay(), getYear());
    }


    public String toStringStandart() {
        return String.format("%d/%d/%d", getMonth(), getDay(), getYear());
    }

    public String toStringForDayNumber() {
        return String.format("%d %d", getNumberDayInYear(), getYear());
    }
}
