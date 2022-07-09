package com.design.pattern.behavioural.template;

public class GameB extends AbstractGame {
    @Override
    public void initialize() {
        System.out.println("initialize gameB");
    }

    @Override
    public void startPlay() {
        System.out.println("start play gameB");
    }

    @Override
    public void endPlay() {
        System.out.println("gameB end");
    }
}
