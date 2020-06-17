package observer;

public class WeatherStationWithObservable {
    public static void main(String[] args) {
        WeatherDataWithObservable weatherData = new WeatherDataWithObservable();

        CurrentConditionsDisplayWithObserver currentDisplay = new CurrentConditionsDisplayWithObserver(weatherData);

        System.out.println("------------------------");
        weatherData.setMeasurements(80, 65, 30.45f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.4f);
        System.out.println("------------------------");
    }
}
