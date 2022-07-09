package com.design.pattern.behavioural.state.refactor;

public class NewCreatedState implements State{

    private static NewCreatedState instance = new NewCreatedState();

    public static NewCreatedState instance(){
        return instance;
    }

    @Override
    public void updateState(Context context) {
        System.out.println("newCreatedState update, packageId= "+ context.getPackageId());
        context.setState(instance);
    }
}
