package com.design.pattern.structual.decorator;

public class DecoratorService {

    public static void main(String[] args) {
        new ConcreteDecorator(new ConcreteComponent()).operation();
    }
}
