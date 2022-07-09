package com.design.pattern.behavioural.state.demo;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/20 2:37 PM
 **/
public class DemoExecute {

    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(new LiftCloseState(lift));
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
