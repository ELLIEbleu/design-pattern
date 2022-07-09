package com.design.pattern.structual.flyweight;

import java.util.HashMap;
import java.util.Vector;

public class FlyweightFactory {

    private static final HashMap concretePool = new HashMap();

    public static Flyweight getFlyweight(String type) {
        Flyweight concreteFlyweight = (ConcreteFlyweight) concretePool.get(type);
        if( concreteFlyweight == null){
            Flyweight  flyweight = new ConcreteFlyweight(type);
            concretePool.put(type,flyweight);
            return flyweight;
        }
        return concreteFlyweight;
    }
}
