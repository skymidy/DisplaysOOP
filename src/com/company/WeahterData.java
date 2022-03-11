package com.company;

import java.util.ArrayList;
import java.util.List;

public class WeahterData implements SubjectIntereface {

    private List<SubscriberInterface> subscribersList;

    private float temperature;
    private float humidity;
    private float pressure;


    public WeahterData() {
        this.subscribersList = new ArrayList<>();
        this.temperature = -10;
        this.humidity = 90;
        this.pressure = 1;
    }

    @Override
    public void subscribe(SubscriberInterface subscriberInterface) {
        subscribersList.add(subscriberInterface);
    }

    @Override
    public void removeSubscriber(SubscriberInterface subscriberInterface) {
        subscribersList.remove(subscriberInterface);
    }

    @Override
    public void notifyAllSubscribers() {

//        for (int i = 0; i < subscribersList.size(); i++) {
//            subscribersList.get(i).setData(this.temperature, this.humidity, this.pressure);
//        }

        for (SubscriberInterface subscriber : subscribersList) {
            subscriber.setData(this.temperature, this.humidity, this.pressure);
            subscriber.update();
        }
    }

}
