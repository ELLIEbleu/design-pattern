package com.design.pattern.behavioural.state.demo;


/**
 * @Description
 * @Author ellie
 * @Date 2021/5/20 2:24 PM
 **/

public class Lift {
    private LiftState openState;
    private LiftState closeState;
    private LiftState runState;
    private LiftState stopState;

    /**
     * 定义当前电梯状态
     */
    private LiftState mCurState;

    public Lift() {
        openState = new LiftOpenState(this);
        closeState = new LiftCloseState(this);
        runState = new LiftRunState(this);
        stopState = new LiftStopState(this);
    }

    public void setState(LiftState liftState){
        this.mCurState = liftState;
    }

    public void open(){
        mCurState.open();
    }

    public void close(){
        mCurState.close();
    }

    public void run(){
        mCurState.run();
    }

    public void stop(){
        mCurState.stop();
    }

    public LiftState getOpenState() {
        return openState;
    }

    public LiftState getCloseState() {
        return closeState;
    }

    public LiftState getRunState() {
        return runState;
    }

    public LiftState getStopState() {
        return stopState;
    }
}
