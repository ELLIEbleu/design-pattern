package com.design.pattern.behavioural.iterator;


import com.google.common.collect.Lists;

import java.util.List;

public class IteratorService {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(2,12,8,9);
        list.iterator();

        NumberIterator numberIterator = new NumberIterator(list);
        System.out.println(numberIterator.hasNext());
        System.out.println(numberIterator.next());
    }
}
