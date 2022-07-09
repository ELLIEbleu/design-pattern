package com.design.pattern.behavioural.observer;

import com.clearspring.analytics.util.Lists;

import java.util.List;

public  class Subject extends ConcreteSubject{
    private List<Observer> observers = Lists.newArrayList();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }


    @Override
    public void setState(int state){
        this.state = state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }


}
