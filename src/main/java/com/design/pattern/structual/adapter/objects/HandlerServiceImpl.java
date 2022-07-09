package com.design.pattern.structual.adapter.objects;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.logging.ConsoleHandler;

/**
 * @Description
 * @Author ellie
 * @Date 2021/5/27 5:55 PM
 **/
public class HandlerServiceImpl {
    private List<HandleAdapterService> handleAAdapterServices;

    @PostConstruct
    public void init(){
        handleAAdapterServices.add(new handleAAdapterService());
        handleAAdapterServices.add(new HandleBAdapterService());
    }

    public HandleAdapterService doHandle(Handler handler) {
        for (HandleAdapterService service : handleAAdapterServices) {
            if (service.support(handler)) {
                return service;
            }
        }
        throw new RuntimeException();
    }


    public static void main(String[] args) {
        HandlerServiceImpl handlerService = new HandlerServiceImpl();
//        handlerService.doHandle();
    }
}
