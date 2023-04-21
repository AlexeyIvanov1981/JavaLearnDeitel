package ch8.ex8.exceptions;

public class IllegalDayException extends BaseIllegalArgumentException {
    public IllegalDayException(int day) {
        super("day (" + day + ") out-of-range for the specified month and year");
    }
}
