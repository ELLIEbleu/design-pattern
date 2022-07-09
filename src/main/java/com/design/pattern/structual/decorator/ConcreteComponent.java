package com.design.pattern.structual.decorator;

public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        System.out.println("override by concreteComponent");
    }
}
