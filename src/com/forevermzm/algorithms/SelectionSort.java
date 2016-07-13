package com.forevermzm.algorithms;

import java.util.List;

public class SelectionSort {
    public static void sort(List<Integer> elements) {
        if (elements != null) {
            for (int i = 0 ; i < elements.size(); i ++) {
                int minThisRound = Integer.MAX_VALUE;
                int minIndex = -1;
                for (int j = i ; j < elements.size() ; j ++) {
                    if (elements.get(j) < minThisRound) {
                        minThisRound = elements.get(j);
                        minIndex = j;
                    }
                }
                swap(elements, i, minIndex);
            }
        }
    }

    private static void swap(List<Integer> elements, int i, int j) {
        if (i == j) {
            return;
        }
        int tmp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, tmp);
    }
}
