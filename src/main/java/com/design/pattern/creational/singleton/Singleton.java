package com.design.pattern.creational.singleton;

//饿汉模式
public class Singleton {
    private Singleton(){}

    private static Singleton singleton = new Singleton();   //一开始就new

    public static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
