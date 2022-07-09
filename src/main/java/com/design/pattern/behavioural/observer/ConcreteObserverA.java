package com.design.pattern.behavioural.observer;

public class ConcreteObserverA extends Observer{

    public ConcreteObserverA(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println("concreteObserverA  state is "+ this.subject.getState());
    }
}
