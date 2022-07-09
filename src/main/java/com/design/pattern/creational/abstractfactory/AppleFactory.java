package com.design.pattern.creational.abstractfactory;

public class AppleFactory extends AbstractMarketFactory{

    @Override
    public String plant() {
        return "tree";
    }

    @Override
    public String color() {
        return "red";
    }
}
