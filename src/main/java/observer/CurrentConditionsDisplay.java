package observer;

//Observer - чтобы получать данные от объекта WeatherData
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    //коснструктор передаётся WeatherData, кот. исп-ся для регистрации эл-та в кач-ве наблюдателя
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    //выводит текущие значения
    @Override
    public void display() {
        System.out.println("Current condition:" + temperature + "F degrees and " + humidity + "% humidity");
    }

    //при вызове мы сохраняем значения температуры и влажности восле чего вызываем display()
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
