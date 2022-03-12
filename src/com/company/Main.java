package com.company;

public class Main {

    public static void main(String[] args) {

        // В этой части кода мы объявляем наши экземплеры классов.
        WeatherData weatherData = new WeatherData();

        // Обратите внимание, что тут переменной subject типа ISubject
        // мы присваиваем значение переменной weatherData, которая хранит в себе
        // экземпляр класса WeatherData. Это работает только потому что класс
        // WeatherData реализует свойства интерфейса ISubject и тем
        // самым является этим интерфесом.
        ISubject subject = weatherData;

        // Здесь по такому же принцепу в случае ConsoleDisplay и ISubscriber.
        ISubscriber subscriber = new ConsoleDisplay();
        // Стоит заметить, что хоть и ConsoleDisplay имеет метод printData(),
        // после того как мы присвоем его в переменную subscriber вызвать метод
        // у нас не получиться:
        // subject.printData() -> build failed. java: cannot find symbol.


        // Подписываем нового наблюдателя
        subject.subscribe(subscriber);
        // Уведомляем всех наблюдателей
        subject.notifyAllSubscribers();

        // Удаляем нашего наблюдателя
        subject.removeSubscriber(subscriber);
        // Ещё раз уведомляем всех наблюдателей, но в этот раз уведомлять некого \(0_0')/
        subject.notifyAllSubscribers();

    }
}
