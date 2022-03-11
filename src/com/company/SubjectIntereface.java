package com.company;


public interface SubjectIntereface {

    void subscribe(SubscriberInterface subscriberInterface);
    void removeSubscriber(SubscriberInterface subscriberInterface);

    void notifyAllSubscribers();
}
