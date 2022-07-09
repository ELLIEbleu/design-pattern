package com.design.pattern.structual.adapter.objects;

public class AdapterService {

    public static void main(String[] args) {
        new Target(new Adaptee()).request();
    }
}
