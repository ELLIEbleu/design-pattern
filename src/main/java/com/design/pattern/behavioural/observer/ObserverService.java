package com.design.pattern.behavioural.observer;

public class ObserverService {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observerA= new ConcreteObserverA(subject);
        Observer observerB = new ConcreteObserverB(subject);

        subject.setState(12);
    }
}
