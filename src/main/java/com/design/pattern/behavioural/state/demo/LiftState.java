package com.design.pattern.behavioural.state.demo;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/20 2:17 PM
 **/
public abstract class LiftState {

    protected Lift mLift;

    public LiftState(Lift mLift) {
        this.mLift = mLift;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
