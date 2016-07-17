package com.forevermzm.algorithms;

import java.util.Random;

public class QuickSort {
    public static void sort(int[] elements) {
        if (elements == null || elements.length == 0) {
            return;
        }
        quickSort(elements, 0, elements.length - 1);
    }

    private static void quickSort(int[] elements, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = new Random().nextInt(right - left + 1) + left;
        int pivot = elements[pivotIndex];
        swap(elements, pivotIndex, right);
        int upperIndex = right;
        int lowerIndex = left;
        while (lowerIndex < upperIndex) {
            if (elements[lowerIndex] > pivot) {
                upperIndex --;
                swap(elements, lowerIndex, upperIndex);
            } else {
                lowerIndex ++;
            }
        }
        swap(elements, upperIndex, right);
        quickSort(elements, left, upperIndex - 1);
        quickSort(elements, upperIndex + 1, right);
    }

    private static void swap(int[] elements, int indexA, int indexB) {
        if (indexA == indexB) {
            return;
        }
        int temp = elements[indexA];
        elements[indexA] = elements[indexB];
        elements[indexB] = temp;
    }
}
