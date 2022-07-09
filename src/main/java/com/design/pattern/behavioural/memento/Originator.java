package com.design.pattern.behavioural.memento;

public class Originator {
    private int state;
    private Memento memento;

    public Originator(int state) {
        this.state = state;
    }

    private Memento createMemento(int state){
        return new Memento(state);
    }

    public void restoreToMemento(int state){
        memento = createMemento(state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getStateFromMemento(){
        return memento.getState();
    }
}
