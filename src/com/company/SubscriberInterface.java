package com.company;

public interface SubscriberInterface { //Интерфейс для наблюдателя |(О_О)|

    //Метод для получения данных
    //Тут стоит передавать не определённые пременные, а объект события,
    //который бы хранил в себе все необходимые данные.
    void setData(float temperature, float humidity, float pressure);
    void update(); //Метод для обновления данных
}
