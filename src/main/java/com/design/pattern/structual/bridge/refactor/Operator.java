package com.design.pattern.structual.bridge.refactor;

public abstract class Operator {
    protected AlgorithmService algorithmService;

    protected Operator(AlgorithmService algorithmService){
        this.algorithmService = algorithmService;
    }

    public abstract void operator();
}
