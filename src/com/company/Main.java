package com.company;

public class Main {

    public static void main(String[] args) {

        SubscriberInterface subscriber = new ConsoleDisplay();

        WeahterData weahterData = new WeahterData();
        SubjectIntereface subject = weahterData;

        subject.subscribe(subscriber);

        subject.notifyAllSubscribers();

    }
}
