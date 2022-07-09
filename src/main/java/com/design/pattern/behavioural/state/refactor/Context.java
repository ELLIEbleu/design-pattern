package com.design.pattern.behavioural.state.refactor;

//create context class
public class Context {
    private State state;
    private String packageId;

    public Context(State state, String packageId) {
        this.state = state;
        this.packageId = packageId;

        if( state ==null){
            this.state = NewCreatedState.instance();
        }
    }

    public void setState(State state){
        this.state = state;
    }

    public String getPackageId() {
        return packageId;
    }

    public void update() {
        state.updateState(this);
    }


}
