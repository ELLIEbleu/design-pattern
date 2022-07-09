package com.design.pattern.structual.adapter.objects;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/27 5:54 PM
 **/
public class handleAAdapterService implements HandleAdapterService {
    @Override
    public boolean support(Handler handler) {
        return true;
    }

    @Override
    public void preHandle() {

    }

    @Override
    public void postHandle() {

    }
}
