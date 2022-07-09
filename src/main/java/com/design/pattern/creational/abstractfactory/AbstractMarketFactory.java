package com.design.pattern.creational.abstractfactory;

public abstract class AbstractMarketFactory {
    public abstract String color();
    public abstract String plant();


    public static void main(String[] args) {
        AbstractMarketFactory factory = new FishFactory();
        System.out.println(factory.color());
        System.out.println(factory.plant());

        AbstractMarketFactory factory1 = new AppleFactory();
        System.out.println(factory1.color());
        System.out.println(factory1.plant());
    }
}
