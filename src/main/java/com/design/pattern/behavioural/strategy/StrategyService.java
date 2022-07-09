package com.design.pattern.behavioural.strategy;

public class StrategyService {
    public static void main(String[] args) {
        new Context(new ConcreteStrategyA(),new StrategyA()).doAction();
    }
}
