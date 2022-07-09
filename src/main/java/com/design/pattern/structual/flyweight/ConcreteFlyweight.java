package com.design.pattern.structual.flyweight;

public class ConcreteFlyweight implements Flyweight{
    private String type;

    public ConcreteFlyweight(String type) {
        this.type = type;
    }

    @Override
    public void operation() {
        System.out.println("concreteFlyweight implement operation, type is "+ type);
    }
}
