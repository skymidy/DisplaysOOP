package com.company;


public interface SubjectInterface { //Интерфейс для объекта,за которым можно наблюдать. ( 0-0) (0-0 )

    //Методы для добавления/удаления наблюдателей.
    //Обратите внимание, что метды принимаю на вход экземпляры SubscriberInterface.
    //Этим мы гарантируем, что у наблюдателя есть необходимые свойства(включая методы),
    //с помощью которых мы сможем уведомить наблюдателя о неком событии
    void subscribe(SubscriberInterface subscriberInterface);
    void removeSubscriber(SubscriberInterface subscriberInterface);


    void notifyAllSubscribers();
}
