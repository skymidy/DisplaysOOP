package com.company;

import java.util.ArrayList;

public class ConsoleDisplay implements SubscriberInterface{

    private float temperature;
    private float humidity;
    private float pressure;

    public ConsoleDisplay() {
        this.temperature = 0;
        this.humidity = 0;
        this.pressure = 0;
    }

    @Override
    public void setData(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void update() {
        printData();
    }

    public void printData()
    {
        System.out.printf("temperature: %.3f humidity: %f pressure: %f\n", temperature, humidity, pressure);
    }

}
