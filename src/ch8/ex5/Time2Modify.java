package ch8.ex5;

import ch8.simpleTime.Time2;

public class Time2Modify {

    private int second;


    public Time2Modify() {
        this(0);
    }

    public Time2Modify(int second) {

        if (second < 0 || second >= 86400) {
            throw new IllegalArgumentException("second must be more 0");
        }

        this.second = second;
    }

    public Time2Modify(Time2Modify time2Modify) {

        this(time2Modify.getSecond());
    }

    public void setTime(int second) {
        if (second < 0 || second >= 86400) {
            throw new IllegalArgumentException("second must be more 0");
        }
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 86400) {
            throw new IllegalArgumentException("second must be more 0");
        }
        this.second = second;
    }

    public String toUniversalString() {
        int hours = getSecond() / 3600;
        int minute = getSecond() / 60 % 60;
        int second = getSecond() / 1 % 60;
        return String.format("%02d:%02d:%02d", hours, minute, second);
    }

    public String toString() {
        int hours = getSecond() / 3600;
        int minute = getSecond() / 60 % 60;
        int second = getSecond() / 1 % 60;
        return String.format("%d:%02d:%02d %s",
                ((hours == 0 || hours == 12) ? 12 : hours % 12),
                minute, second, (hours < 12 ? "AM" : "PM"));
    }
}
