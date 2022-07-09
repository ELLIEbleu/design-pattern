package com.design.pattern.behavioural.state.refactor;

public class RunningState implements State{

    private static RunningState instance = new RunningState();

    public static RunningState instance(){
        return instance;
    }

    @Override
    public void updateState(Context context) {
        System.out.println("RunningState update,packageId="+ context.getPackageId());
        context.setState(instance);
    }
}
