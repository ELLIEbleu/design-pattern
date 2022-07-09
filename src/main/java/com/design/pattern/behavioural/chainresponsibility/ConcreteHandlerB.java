package com.design.pattern.behavioural.chainresponsibility;

public class ConcreteHandlerB extends Handler{

    public ConcreteHandlerB(Handler handler,int state){
        this.nextHandler = handler;
        this.state = state;
    }

    @Override
    public void handleRequest() {
        if( getState() >6) {
            System.out.println("concreteHandlerB  ");

            //
        }else {
            getNextHandler().handleRequest();
        }
    }
}
