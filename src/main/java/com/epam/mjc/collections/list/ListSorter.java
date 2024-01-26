package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        int absCompare = Integer.compare(Math.abs(intA), Math.abs(intB));

        if (absCompare == 0) {
            return Integer.compare(intA, intB);
        }

        return absCompare;
    }
}
