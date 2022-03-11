package com.company;

public interface SubscriberInterface {
    void setData(float temperature, float humidity, float pressure); //Метод для получения данных
    void update(); //Метод для обновления данных
}
