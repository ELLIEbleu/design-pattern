package com.design.pattern.behavioural.chainresponsibility;

public class ConcreteHandlerC extends Handler{
    public ConcreteHandlerC(Handler handler,int state){
        this.nextHandler = handler;
        this.state = state;
    }

    @Override
    public void handleRequest() {
        System.out.println("ConcreteHandlerC handle request");
    }
}
