package com.design.pattern.structual.bridge.refactor;

public class WindowOperator extends Operator{
    private String name;
    private String version;
    private String tag;

    public WindowOperator(AlgorithmService algorithmService, String name, String version, String tag) {
        super(algorithmService);
        this.name = name;
        this.version = version;
        this.tag = tag;
    }

    @Override
    public void operator() {
        algorithmService.execute();
    }
}
