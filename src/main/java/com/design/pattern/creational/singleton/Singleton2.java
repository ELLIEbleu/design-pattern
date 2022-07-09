package com.design.pattern.creational.singleton;

public class Singleton2 {
    private Singleton2(){}

    //嵌套类可以访问外部类的静态属性和静态方法 的特性
    private static class Holder{
        private static Singleton2 singleton2 = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return Holder.singleton2;
    }

    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getInstance();
    }
}
