package com.forevermzm.algorithms;

/**
 * Give an array of chars "cbabcccccaaabbbb", then sort it to
 * "aaaabbbbbbcccccc"
 *
 * Counting the number of 'a', 'b' and 'c' is definitely easier,
 * but I am using the so-called rainbow sort here.
 */
public class RainbowSort {
    public static void sort(char[] elements) {
        if (elements == null || elements.length <= 1) {
            return;
        }
        int i = 0;
        int j = 0;
        int k = elements.length - 1;
        while (j <= k) {
            if (elements[j] == 'c') {
                swap(elements, j, k);
                k --;
            } else if (elements[j] == 'b') {
                j ++;
            } else if (elements[j] == 'a') {
                swap(elements, i, j);
                i ++;
                j ++;
            } else {
                throw new RuntimeException("Not a valid char: " + elements[j]);
            }
        }
    }

    private static void swap(char[] elements, int indexA, int indexB) {
        if (indexA == indexB) {
            return;
        }
        char temp = elements[indexA];
        elements[indexA] = elements[indexB];
        elements[indexB] = temp;
    }
}
