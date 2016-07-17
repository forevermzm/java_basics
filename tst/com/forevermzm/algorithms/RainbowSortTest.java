package com.forevermzm.algorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class RainbowSortTest {
    @Test
    public void testSort() {
        char[] elements = "cbabcccccaaabbbb".toCharArray();

        RainbowSort.sort(elements);

        assertEquals("aaaabbbbbbcccccc", new String(elements));
    }
}