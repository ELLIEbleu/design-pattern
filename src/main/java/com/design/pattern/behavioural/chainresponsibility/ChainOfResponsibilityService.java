package com.design.pattern.behavioural.chainresponsibility;

public class ChainOfResponsibilityService {

    public static void main(String[] args) {
        Handler handlerC = new ConcreteHandlerC(null,4);
        Handler handlerB = new ConcreteHandlerB(handlerC,2);
        Handler handlerA = new ConcreteHandlerA(handlerB,1);

        handlerA.handleRequest();
    }
}
