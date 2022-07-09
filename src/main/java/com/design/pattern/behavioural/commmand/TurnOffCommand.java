package com.design.pattern.behavioural.commmand;

/**
 * @Description
 * @Author ellie
 * @Date 2022/2/11 2:07 下午
 **/
public class TurnOffCommand implements Command{
    private AirConditionReceiver airConditionReceiver;

    public TurnOffCommand(AirConditionReceiver airConditionReceiver) {
        this.airConditionReceiver = airConditionReceiver;
    }

    @Override
    public void execute() {
        airConditionReceiver.turnOff();
    }
}
