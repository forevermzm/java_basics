package com.forevermzm.algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {
    @Test
    public void testSort() {
        int[] elements = {8, -3, -1, 7, -8};

        QuickSort.sort(elements);

        assertEquals(Arrays.asList(-8, -3, -1, 7, 8),
                IntStream.of(elements).boxed().collect(Collectors.toList()));
    }

    @Test
    public void testSort_withOneElement() {
        int[] elements = {8};

        QuickSort.sort(elements);

        assertEquals(Arrays.asList(8),
                IntStream.of(elements).boxed().collect(Collectors.toList()));
    }

    @Test
    public void testSort_withNoElement() {
        int[] elements = {};

        QuickSort.sort(elements);

        assertEquals(new ArrayList<Integer>(),
                IntStream.of(elements).boxed().collect(Collectors.toList()));
    }

    @Test
    public void testSort_withNull() {
        QuickSort.sort(null);
    }
}