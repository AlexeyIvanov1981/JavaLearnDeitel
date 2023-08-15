package HeadFirstJavaPatterns.WeatherStation;

import java.util.ArrayList;
import java.util.Objects;

public class StatisticsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherDate;
    private ArrayList<Float> allTemp;

    public StatisticsDisplay(Subject weatherDate){
        allTemp = new ArrayList<>();
        this.weatherDate = weatherDate;
        weatherDate.registerObservers(this);
    }

    @Override
    public void display() {
        System.out.println("AVG conditions: " + temperature
                + "F degrees and " + humidity + "% humidity " + "and pressure " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        allTemp.add(temperature);
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public float getTemperature(ArrayList allTemp){
        float avgTemp;

        for (Object temp: allTemp){

        }



//        while (!allTemp.isEmpty()){
//
//        }

        return avgTemp;
    }
}
