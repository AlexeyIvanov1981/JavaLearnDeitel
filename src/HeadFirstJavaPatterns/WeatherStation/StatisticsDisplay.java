package HeadFirstJavaPatterns.WeatherStation;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {

    private int count = 0;
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherDate;
    private ArrayList<Float> allTemperature;
    private ArrayList<Float> allHumidity;

    public StatisticsDisplay(Subject weatherDate) {
        allTemperature = new ArrayList<>();
        allHumidity = new ArrayList<>();
        this.weatherDate = weatherDate;
        weatherDate.registerObservers(this);
    }

    @Override
    public void display() {
        System.out.println("AVG conditions: " + getAvgTemperature()
                + "F degrees and " + getHumidity() + "% AVG humidity " + "and pressure " + pressure);
    }

    @Override
    public void update(float tem, float hum, float pressure) {
        this.temperature = tem;
        count++;
        allTemperature.add(temperature);
        this.humidity = hum;
        allHumidity.add(humidity);
        this.pressure = pressure;
        display();
    }

    public float getAvgTemperature() {
        float avgTemp = 0;
        for (float temp : allTemperature) {
            avgTemp += temp;
        }
        return avgTemp / count;
    }

    public float getHumidity() {
        float avgHum = 0;
        for (float hum : allHumidity) {
            avgHum += hum;
        }
        return avgHum / count;
    }
}
