package com.design.pattern.structual.facade;

public class FacadeService {

    public static void main(String[] args) {
        Facade facade = new Facade(new SubSystemsA(),new SubSystemsB());
        facade.report();
        facade.export();
    }
}
