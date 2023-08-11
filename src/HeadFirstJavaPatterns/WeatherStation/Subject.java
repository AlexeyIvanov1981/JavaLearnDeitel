package HeadFirstJavaPatterns.WeatherStation;

public interface Subject {
    public void registerObservers();

    public void removeObservers();

    public void notifyObservers();
}
