package com.design.pattern.behavioural.chainresponsibility;


public class ConcreteHandlerA extends Handler{
    public ConcreteHandlerA(Handler handler,int state){
        this.nextHandler = handler;
        this.state = state;
    }

    @Override
    public void handleRequest() {
        if( getState() <5){
            System.out.println("request forward");
            getNextHandler().handleRequest();
        }else {
            System.out.println("handle this request");
        }
    }
}
