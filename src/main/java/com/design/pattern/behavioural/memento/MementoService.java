package com.design.pattern.behavioural.memento;

public class MementoService {

    public static void main(String[] args) {
        Originator originator = new Originator(10);
        originator.restoreToMemento(10);
        originator.getStateFromMemento();

        originator.setState(12);
        System.out.println(originator.getState());

        System.out.println(originator.getStateFromMemento());

    }
}
