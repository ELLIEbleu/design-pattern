package com.design.pattern.structual.bridge.refactor;

public class LinuxOperator extends Operator{
    private String name;
    private String version;

    public LinuxOperator(AlgorithmService algorithmService, String name, String version) {
        super(algorithmService);
        this.name = name;
        this.version = version;
    }


    @Override
    public void operator() {
       algorithmService.execute();
    }
}
