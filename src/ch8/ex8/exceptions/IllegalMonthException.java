package ch8.ex8.exceptions;

public class IllegalMonthException extends BaseIllegalArgumentException {
    public IllegalMonthException(int month) {super("month (" + month + ") must be 1-12");}
}
