package com.design.pattern.behavioural.iterator;

import com.google.common.collect.Lists;

import java.util.LinkedList;
import java.util.List;

public class NumberIterator implements Iterator<Integer> {
    private List<Integer> list;

    public NumberIterator(List<Integer> list) {
        this.list = list;
    }

//    private NumberIterator(){
//    }
//    private static NumberIterator instance = new NumberIterator();

    @Override
    public boolean hasNext() {
        return list.iterator().hasNext();
    }

    @Override
    public Object next() {
        return list.iterator().next();
    }

    @Override
    public void add(Integer added) {
        list.add(added);
    }
}
