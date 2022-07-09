package com.design.pattern.behavioural.commmand;

/**
 * @Description
 * @Author ellie
 * @Date 2022/2/11 1:58 下午
 **/
public class Client {
    public static void main(String[] args) {
        Command command = new TurnOnCommand( new AirConditionReceiver());
        Invoker invoker = new Invoker(command);
        invoker.action();

        Command turnOffCommand = new TurnOffCommand(new AirConditionReceiver());
        Invoker turnOffInvoker = new Invoker(turnOffCommand);
        turnOffInvoker.action();
//        turnOffCommand.execute();
    }
}
