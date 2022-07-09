package com.design.pattern.behavioural.observer;

public class ConcreteObserverB extends Observer{

    public ConcreteObserverB(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("concreteObserverB state is "+ this.subject.getState());
    }
}
