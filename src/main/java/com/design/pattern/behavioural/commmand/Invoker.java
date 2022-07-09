package com.design.pattern.behavioural.commmand;

/**
 * @Description
 * @Author ellie
 * @Date 2022/2/11 2:05 下午
 **/
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        System.out.println("开始调试 --->");
        command.execute();
    }
}
