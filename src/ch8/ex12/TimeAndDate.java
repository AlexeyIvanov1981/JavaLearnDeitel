package ch8.ex12;


public class TimeAndDate {
    private int hour;
    private int minute;
    private int second;
    private int month;
    private int day;
    private int year;
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public TimeAndDate(int month, int day, int year, int hour, int minute, int second) {

        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");


        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String toString() {
        return String.format("%n%d:%02d:%02d %s%n%d/%d/%d",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"),getMonth(), getDay(), getYear());
    }

    public String toUniversalString() {
        return String.format("%n%02d:%02d:%02d%n%d/%d/%d", getHour(), getMinute(), getSecond(),
                getMonth(), getDay(), getYear());
    }

    public void tick() {
        if (getSecond() + 1 >= 60) {
            setSecond(0);
            try {
                setMinute(getMinute() + 1);
            } catch (Exception e) {
                setMinute(0);
                try {
                    setHour(getHour() + 1);
                }catch (Exception exception){
                    setHour(0);
                    nextDay();
                }
//
            }
        } else setSecond(getSecond() + 1);
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

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.second = second;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
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
}
