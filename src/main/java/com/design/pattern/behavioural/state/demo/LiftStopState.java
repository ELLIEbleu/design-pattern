package com.design.pattern.behavioural.state.demo;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/20 2:31 PM
 **/
public class LiftStopState extends LiftState{

    public LiftStopState(Lift mLift) {
        super(mLift);
    }

    @Override
    public void open() {
        mLift.setState(mLift.getOpenState());
        mLift.open();
    }

    @Override
    public void close() {
        //do nothing
    }

    @Override
    public void run() {
        mLift.setState(mLift.getRunState());
        mLift.run();
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
