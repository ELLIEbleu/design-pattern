package com.design.pattern.creational.singleton;

//饱汉模式
public class Singleton1 {
    private Singleton1(){}

    private static volatile Singleton1  singleton1 = null;    //延迟new

    //check -lock -check
    public static Singleton1 getInstance(){
        if (singleton1 == null){
            synchronized (Singleton1.class){
                if( singleton1 == null){
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
    }
}
