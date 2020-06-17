package observer;

import java.util.Observable;

public class WeatherDataWithObservable extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataWithObservable() { }

    //оповещение наблюдателей о появлении новых данных
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //получение состояния
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
