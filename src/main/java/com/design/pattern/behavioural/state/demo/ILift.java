package com.design.pattern.behavioural.state.demo;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/20 2:15 PM
 **/
public interface ILift {

    void setState();

    void open();

    void close();

    void run();

    void stop();
}
