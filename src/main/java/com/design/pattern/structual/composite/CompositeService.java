package com.design.pattern.structual.composite;

public class CompositeService {
    public static void main(String[] args) {
        Component component1 = new AccountantLeaf();
        Component component2 = new EngineerLeaf();

        Composite com = new Composite();
        com.addComponent(component1);
        com.addComponent(component2);
        com.operation();
    }
}
