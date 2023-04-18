package ch8.ex8;

public class DateIncrement {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateIncrement(int month, int day, int year) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    public void nextDay() {
        if (getDay() + 1 <= daysPerMonth[getMonth()]) {
            setDay(getDay() + 1);
        } else if (getDay() + 1 > daysPerMonth[getMonth()]) {
            setDay(1);
            try {
                setMonth(getMonth() + 1);
            } catch (Exception e) {
                setMonth(1);
                setYear(getYear() + 1);
            }
        }
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        this.month = month;
    }

    public void setDay(int day) {
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 0 || year > 2500)
            throw new IllegalArgumentException("year (" + year + ") out-of-range for year");
        this.year = year;
    }
}
