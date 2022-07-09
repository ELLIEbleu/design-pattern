package com.design.pattern.behavioural.state.demo;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/20 2:30 PM
 **/
public class LiftRunState extends LiftState{

    public LiftRunState(Lift mLift) {
        super(mLift);
    }

    @Override
    public void open() {
        //do nothing
    }

    @Override
    public void close() {
        //do nothing
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void stop() {
        mLift.setState(mLift.getStopState());
        mLift.stop();
    }
}
