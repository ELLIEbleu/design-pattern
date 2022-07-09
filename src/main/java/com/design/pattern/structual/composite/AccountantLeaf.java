package com.design.pattern.structual.composite;

public class AccountantLeaf implements Component{
    @Override
    public void operation() {
        System.out.println("Accountant leaf operation");
    }
}
