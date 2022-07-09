package com.design.pattern.behavioural.state.old;

public class FSMService {

    public static String getResponse(String type) {
        switch (type) {
            case "Ticket":
                return "ok";
            default:
                return "Alarm";
        }
    }

    public static void main(String[] args) {
        String res = getResponse("Ticket");
        System.out.println(res);
    }
}
