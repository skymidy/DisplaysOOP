package com.company;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject { // Реализуем интерфейс ISubject

    // Структура данных список
    private List<ISubscriber> subscribersList;

    private float temperature;
    private float humidity;
    private float pressure;

    // Конструктор класса
    public WeatherData() {
        // Ключевое слово this используется для обращения
        // к полям класса, в котором этот метод находится.
        this.subscribersList = new ArrayList<>();
        this.temperature = -10;
        this.humidity = 90;
        this.pressure = 1;
    }

    // Реализуем методы интерфейса ISubject.
    // Описание методов есть в файлах интрфейса.
    @Override
    public void subscribe(ISubscriber iSubscriber) {
        subscribersList.add(iSubscriber);
    }

    @Override
    public void removeSubscriber(ISubscriber iSubscriber) {
        subscribersList.remove(iSubscriber);
    }

    @Override
    public void notifyAllSubscribers() {

//        for (int i = 0; i < subscribersList.size(); i++) {
//            subscribersList.get(i).setData(this.temperature, this.humidity, this.pressure);
//        }

        for (ISubscriber subscriber : subscribersList) {
            subscriber.setData(this.temperature, this.humidity, this.pressure);
            subscriber.update();
        }
    }

}
