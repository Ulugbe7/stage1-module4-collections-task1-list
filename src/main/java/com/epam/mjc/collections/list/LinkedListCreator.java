package com.epam.mjc.collections.list;

import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        LinkedList<Integer> mList = new LinkedList<>();

        for (Integer i : sourceList) {
            if (i % 2 == 1) {
                mList.addFirst(i);
            } else {
                mList.add(i);
            }
        }

        return mList;
    }
}
