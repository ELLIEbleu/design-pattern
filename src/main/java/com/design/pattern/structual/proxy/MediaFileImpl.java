package com.design.pattern.structual.proxy;

public class MediaFileImpl implements MediaFile{

    public void say(){
        System.out.println("mediaFileImpl say");
    }

    public void read(){
        System.out.println("mediaFileImpl read ");
    }

    @Override
    public void print() {
        System.out.println("MediaFileImpl implement print ");
    }
}
