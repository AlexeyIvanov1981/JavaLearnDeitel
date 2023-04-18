package ch8.ex10;

public enum TrafficColor {
    RED(5),
    YELLOW(6),
    GREEN(10);

    private final int second;

    TrafficColor(int second){
        this.second = second;
    }

    public int getSecond() {
        return second;
    }
}
