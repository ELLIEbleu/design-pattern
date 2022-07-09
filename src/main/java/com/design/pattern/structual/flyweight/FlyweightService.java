package com.design.pattern.structual.flyweight;

public class FlyweightService {

    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getFlyweight("test");
        flyweight.operation();
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("demo");
        flyweight1.operation();

    }
}
