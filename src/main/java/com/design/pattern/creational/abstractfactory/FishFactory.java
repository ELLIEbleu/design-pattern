package com.design.pattern.creational.abstractfactory;

public class FishFactory extends AbstractMarketFactory{

    @Override
    public String color() {
        return "gray";
    }

    @Override
    public String plant() {
        return "water";
    }
}
