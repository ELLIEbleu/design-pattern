package com.design.pattern.structual.facade;

public class Facade {
    private SubSystemsA subSystemsA;
    private SubSystemsB subSystemsB;

    public Facade(SubSystemsA subSystemsA, SubSystemsB subSystemsB) {
        this.subSystemsA = subSystemsA;
        this.subSystemsB = subSystemsB;
    }

    public void report() {
        subSystemsA.operation();
    }
    public void export(){
        subSystemsB.operation();
    }
}
