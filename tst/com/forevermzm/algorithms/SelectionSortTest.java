package com.forevermzm.algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SelectionSortTest {

    @Test
    public void testSort() {
        List<Integer> elements = Arrays.asList(8, -3, -1, 7, -8);

        SelectionSort.sort(elements);

        assertEquals(Arrays.asList(-8, -3, -1, 7, 8), elements);
    }

    @Test
    public void testSort_withOneElement() {
        List<Integer> elements = Arrays.asList(8);

        SelectionSort.sort(elements);

        assertEquals(Arrays.asList(8), elements);
    }

    @Test
    public void testSort_withNoElement() {
        List<Integer> elements = new ArrayList<>();

        SelectionSort.sort(elements);

        assertEquals(new ArrayList<Integer>(), elements);
    }

    @Test
    public void testSort_withNull() {
        SelectionSort.sort(null);
    }
}