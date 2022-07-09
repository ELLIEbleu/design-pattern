package com.design.pattern.behavioural.state.demo;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/20 2:18 PM
 **/
public class LiftOpenState extends LiftState {

    public LiftOpenState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        mLift.setState(mLift.getCloseState());
        mLift.close();
    }

    @Override
    public void run() {
        //do nothing
    }

    @Override
    public void stop() {
        //do nothing
    }
}
