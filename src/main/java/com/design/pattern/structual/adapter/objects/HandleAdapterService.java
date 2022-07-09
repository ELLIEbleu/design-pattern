package com.design.pattern.structual.adapter.objects;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/27 6:02 PM
 **/
public interface HandleAdapterService {
    boolean support(Handler handler);

    void preHandle();

    void postHandle();
}
