package com.forevermzm.algorithms;

import java.util.List;

public class MergeSort {
    public static void sort(List<Integer> elements) {
        if (elements == null || elements.isEmpty()) {
            return;
        }
        sortSub(elements, 0, elements.size() - 1);
    }

    private static void sortSub(List<Integer> elements, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sortSub(elements, left, mid);
        sortSub(elements, mid + 1, right);
        merge(elements, left, mid, right);
    }

    private static void merge(List<Integer> elements, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int[] tempResult = new int[right - left + 1];
        int pointer = 0;
        while (i <= mid && j <= right) {
            if (elements.get(i) <= elements.get(j)) {
                tempResult[pointer] = elements.get(i);
                i ++;

            } else {
                tempResult[pointer] = elements.get(j);
                j ++;
            }
            pointer ++;
        }
        if (i > mid) {
            for (int k = j ; k <= right ; k++) {
                tempResult[pointer] = elements.get(k);
                pointer ++;
            }
        } else {
            for (int k = i ; k <= mid ; k ++) {
                tempResult[pointer] = elements.get(k);
                pointer ++;
            }
        }
        for (int k = left; k <= right; k ++) {
            elements.set(k, tempResult[k - left]);
        }
    }
}
