package com.liuwei.designpattern.state.example2;

/**
 * @author liuwei2
 */
public class Switch {
    private static State state,offState,onState;
    private String name;

    public Switch(String name) {
        offState = new OffState();
        onState = new OnState();
        state = onState;
        this.name = name;
    }

    public void setState(State state) {
        Switch.state = state;
    }

    public static State getState(String type) {
        if (type.equalsIgnoreCase("on")) {
            return onState;
        } else {
            return offState;
        }
    }

    public void on() {
        System.out.println(name);
        state.on(this);
    }

    public void off() {
        System.out.println(name);
        state.off(this);
    }
}
