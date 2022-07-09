package com.design.pattern.behavioural.state.demo;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/20 2:30 PM
 **/
public class LiftCloseState  extends LiftState{

    public LiftCloseState(Lift mLift) {
        super(mLift);
    }

    @Override
    public void open() {
        mLift.setState(mLift.getOpenState());
        mLift.open();
    }

    @Override
    public void close() {
        System.out.println("close ");
    }

    @Override
    public void run() {
        mLift.setState(mLift.getRunState());
        mLift.run();
    }

    @Override
    public void stop() {
        mLift.setState(mLift.getStopState());
        mLift.stop();
    }
}
