package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    //ArrayList для хранения наблюдателей
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        //создаём ArrayList
        this.observers = new ArrayList();
    }

    //новые наблюдатели добавляются в конец списка
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //если наблюдатель хочет отменить регистрацию, просто удаляем его из списка.
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(i);
        }
    }

    //оповещение наблюдателей об изменении состояния через метод update(), реализуемый всеми наблюдателями
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    //оповещение наблюдателей о появлении новых данных
    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
