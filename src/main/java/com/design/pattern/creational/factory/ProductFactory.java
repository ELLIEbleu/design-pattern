package com.design.pattern.creational.factory;

public class ProductFactory {
    public static Product createProduct(String type){
        switch (type){
            case "Apple":
                return new Apple();
            case "Tomato":
                return new Tomato();

        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Product product = ProductFactory.createProduct("Apple");      //定义创建对象的接口，封装了对象的创建
        System.out.println(product.color());  //将具体化类的工作延迟到子类中
    }
}
