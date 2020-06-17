package observer;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayWithObserver extends Observable implements DisplayElement, Observer {
    Observable observable;
    private float temperature;
    private float humidity;

    //коснструктор передаётся WeatherData, кот. исп-ся для регистрации эл-та в кач-ве наблюдателя
    public CurrentConditionsDisplayWithObserver(Observable obser) {
        this.observable = obser;
        obser.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition:" + temperature + "F degrees and " + humidity + "% humidity");
    }

    //получает Observable и необязательные данные
    @Override
    public void update(Observable obs, Object o) {
        //проверка что субъект типа WeatherDataWithObservable
        if(obs instanceof WeatherDataWithObservable) {
            WeatherDataWithObservable weatherDataWithObservable = (WeatherDataWithObservable) obs;
            //получение данных
            this.temperature = weatherDataWithObservable.getTemperature();
            this.humidity = weatherDataWithObservable.getHumidity();
            //вывод
            display();
        }
    }
}
