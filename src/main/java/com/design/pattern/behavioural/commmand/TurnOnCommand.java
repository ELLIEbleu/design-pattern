package com.design.pattern.behavioural.commmand;

/**
 * @Description
 * @Author ellie
 * @Date 2022/2/11 2:02 下午
 **/
public class TurnOnCommand implements Command{
    private AirConditionReceiver airConditionReceiver;

    public TurnOnCommand(AirConditionReceiver airConditionReceiver) {
        this.airConditionReceiver = airConditionReceiver;
    }

    @Override
    public void execute() {
        airConditionReceiver.turnOn();
    }
}
