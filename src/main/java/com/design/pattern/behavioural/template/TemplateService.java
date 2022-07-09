package com.design.pattern.behavioural.template;

public class TemplateService {

    public static void main(String[] args) {
        AbstractGame templateA = new GameA();
        templateA.play();
        AbstractGame templateB = new GameB();
        templateB.play();
    }
}
