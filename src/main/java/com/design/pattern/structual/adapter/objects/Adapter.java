package com.design.pattern.structual.adapter.objects;

public class Adapter {
    private Adaptee adaptee ;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request(){
        adaptee.specificRequest();
    }
}
