package com.design.pattern.structual.decorator;

public class Decorator {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation(){
        component.operation();
    }
}
