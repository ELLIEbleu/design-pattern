package com.design.pattern.behavioural.template;

public abstract class AbstractGame {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    /**
     * 模版方法  以final
     */
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
