package com.design.pattern.behavioural.template;

public class GameA extends AbstractGame {
    @Override
    public void initialize() {
        System.out.println("initialize gameA");
    }

    @Override
    public void startPlay() {
        System.out.println("start play gameA");
    }

    @Override
    public void endPlay() {
        System.out.println("end gameA");
    }
}
