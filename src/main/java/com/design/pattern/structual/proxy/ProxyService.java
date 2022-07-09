package com.design.pattern.structual.proxy;

public class ProxyService {

    public static void main(String[] args) {
        new MediaFileProxy(new MediaFileImpl()).print();
    }
}
