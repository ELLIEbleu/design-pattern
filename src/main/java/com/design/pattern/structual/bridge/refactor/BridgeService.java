package com.design.pattern.structual.bridge.refactor;

public class BridgeService {
    public static void main(String[] args) {
        Operator linux1 = new LinuxOperator(new AlgorithmServiceLinuxFirstImpl(),"test1","v1");
        Operator linux2 = new LinuxOperator(new AlgorithmServiceLinuxSecondImpl(),"test2","v2");

        linux1.operator();
        linux2.operator();
    }
}
