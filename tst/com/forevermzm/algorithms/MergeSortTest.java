package com.forevermzm.algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {
    @Test
    public void testSort() {
        List<Integer> elements = Arrays.asList(8, -3, -1, 7, -8);

        MergeSort.sort(elements);

        assertEquals(Arrays.asList(-8, -3, -1, 7, 8), elements);
    }


    @Test
    public void testSort_withOneElement() {
        List<Integer> elements = Arrays.asList(8);

        MergeSort.sort(elements);

        assertEquals(Arrays.asList(8), elements);
    }

    @Test
    public void testSort_withNoElement() {
        List<Integer> elements = new ArrayList<>();

        MergeSort.sort(elements);

        assertEquals(new ArrayList<Integer>(), elements);
    }

    @Test
    public void testSort_withNull() {
        MergeSort.sort(null);
    }
}