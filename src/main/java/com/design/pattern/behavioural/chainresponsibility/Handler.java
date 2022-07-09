package com.design.pattern.behavioural.chainresponsibility;

import java.util.List;

public abstract class Handler {
    protected Handler nextHandler;

    protected int state;

    public abstract void handleRequest();

    public Handler getNextHandler(){
        return nextHandler;
    }

    public int getState() {
        return state;
    }
}
