package com.design.pattern.behavioural.state.refactor;

public class StateService {

    public static void main(String[] args) {
        Context context = new Context(null,"test123");
        context.update();

        Context context1 = new Context(RunningState.instance(),"test345");
        context1.update();
    }
}
