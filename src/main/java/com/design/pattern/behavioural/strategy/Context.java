package com.design.pattern.behavioural.strategy;

public class Context {
    private Strategy strategy;

    private AbstractStrategy abstractStrategy;

    public Context(Strategy strategy,AbstractStrategy abstractStrategy) {
        this.strategy = strategy;
        this.abstractStrategy = abstractStrategy;
    }

    public void doAction(){
        strategy.algorithmSort();
        abstractStrategy.sort();
    }
}
