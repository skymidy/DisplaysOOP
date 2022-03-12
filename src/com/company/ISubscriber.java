package com.company;

public interface ISubscriber { // Интерфейс для наблюдателя |(О_О)|

    // Метод для получения данных
    // Тут стоит принимать не определённые переменные, а объект события,
    // который бы хранил в себе все необходимые данные.
    // В нашем случае можно и так
    void setData(float temperature, float humidity, float pressure);

    // Метод вызова процедуры обновления данных, у наблюдателя.
    void update();
}
