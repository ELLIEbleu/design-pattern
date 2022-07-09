package com.design.pattern.behavioural.iterator;

public interface Iterator<T extends Number> {
    public boolean hasNext();

    public Object next();

    public void add(T added);
}
