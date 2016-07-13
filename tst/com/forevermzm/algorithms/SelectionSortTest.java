package com.forevermzm.algorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SelectionSortTest {

    @Test
    public void testSort() {
        List<Integer> elements = Arrays.asList(8, -3, -1, 7, -8);

        SelectionSort.sort(elements);

        assertEquals(Arrays.asList(-8, -3, -1, 7, 8), elements);
    }
}