package com.forevermzm.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void testSearch() {
        int[] elements = {-8, -3, -1, 7, 8};

        assertEquals(0, BinarySearch.search(elements, -8));
        assertEquals(1, BinarySearch.search(elements, -3));
        assertEquals(2, BinarySearch.search(elements, -1));
        assertEquals(3, BinarySearch.search(elements, 7));
        assertEquals(4, BinarySearch.search(elements, 8));

        assertEquals(-1, BinarySearch.search(elements, -10));
        assertEquals(-1, BinarySearch.search(elements, -2));
        assertEquals(-1, BinarySearch.search(elements, 10));
    }

    @Test
    public void testSearchFirstOccurrence() {
        int[] elements = {-8, -3, -3, -3, -3, -3, -3, 6, 6, 6};

        assertEquals(0, BinarySearch.searchFirstOccurrence(elements, -8));
        assertEquals(1, BinarySearch.searchFirstOccurrence(elements, -3));
        assertEquals(7, BinarySearch.searchFirstOccurrence(elements, 6));

        assertEquals(-1, BinarySearch.searchFirstOccurrence(elements, -10));
        assertEquals(-1, BinarySearch.searchFirstOccurrence(elements, 2));
        assertEquals(-1, BinarySearch.searchFirstOccurrence(elements, 10));
    }

    @Test
    public void testSearchLastOccurrence() {
        int[] elements = {-8, -3, -3, -3, -3, -3, -3, 6, 6, 6};

        assertEquals(0, BinarySearch.searchLastOccurrence(elements, -8));
        assertEquals(6, BinarySearch.searchLastOccurrence(elements, -3));
        assertEquals(9, BinarySearch.searchLastOccurrence(elements, 6));

        assertEquals(-1, BinarySearch.searchLastOccurrence(elements, -10));
        assertEquals(-1, BinarySearch.searchLastOccurrence(elements, 2));
        assertEquals(-1, BinarySearch.searchLastOccurrence(elements, 10));
    }

    @Test
    public void testSearchClosest() {
        int[] elements = {-8, -3, -1, 7, 8};

        assertEquals(0, BinarySearch.searchClosest(elements, -10));
        assertEquals(0, BinarySearch.searchClosest(elements, -8));
        assertEquals(0, BinarySearch.searchClosest(elements, -7));
        assertEquals(1, BinarySearch.searchClosest(elements, -4));
        assertEquals(1, BinarySearch.searchClosest(elements, -3));
        assertEquals(1, BinarySearch.searchClosest(elements, -2));
        assertEquals(4, BinarySearch.searchClosest(elements, 8));
        assertEquals(4, BinarySearch.searchClosest(elements, 10));
    }

    @Test
    public void testSearchUnknownSize() {
        int[] elements = {-8, -3, -1, 7, 8, 10, 12, 15, 17, 19, 21, 23, 25};

        assertEquals(-1, BinarySearch.searchUnknownSize(elements, -10, 5));
        assertEquals(0, BinarySearch.searchUnknownSize(elements, -8, 5));
        assertEquals(0, BinarySearch.searchUnknownSize(elements, -8, 2));
        assertEquals(0, BinarySearch.searchUnknownSize(elements, -8, 13));
        assertEquals(10, BinarySearch.searchUnknownSize(elements, 21, 5));
        assertEquals(10, BinarySearch.searchUnknownSize(elements, 21, 2));
        assertEquals(10, BinarySearch.searchUnknownSize(elements, 21, 13));
        assertEquals(11, BinarySearch.searchUnknownSize(elements, 23, 5));
        assertEquals(11, BinarySearch.searchUnknownSize(elements, 23, 2));
        assertEquals(11, BinarySearch.searchUnknownSize(elements, 23, 13));
        assertEquals(12, BinarySearch.searchUnknownSize(elements, 25, 5));
        assertEquals(12, BinarySearch.searchUnknownSize(elements, 25, 2));
        assertEquals(12, BinarySearch.searchUnknownSize(elements, 25, 13));
        assertEquals(-1, BinarySearch.searchUnknownSize(elements, 24, 5));
        assertEquals(-1, BinarySearch.searchUnknownSize(elements, 24, 2));
        assertEquals(-1, BinarySearch.searchUnknownSize(elements, 24, 13));
    }

    @Test
    public void testSearchWithPivot() {
        int[] elements = {0, -1};

        assertEquals(1, BinarySearch.searchWithPivot(elements, -1));
        assertEquals(0, BinarySearch.searchWithPivot(elements, 0));

        elements = new int[]{17, 19, 21, 23, 25, -8, -3, -1, 7, 8, 10, 12, 15};

        assertEquals(-1, BinarySearch.searchWithPivot(elements, 16));
        assertEquals(0, BinarySearch.searchWithPivot(elements, 17));
        assertEquals(2, BinarySearch.searchWithPivot(elements, 21));
        assertEquals(3, BinarySearch.searchWithPivot(elements, 23));
    }

    @Test
    public void testFindPivot() {
        int[] elements = {1};
        assertEquals(0, BinarySearch.findPivot(elements, 0, elements.length - 1));

        elements = new int[]{2, 1};
        assertEquals(0, BinarySearch.findPivot(elements, 0, elements.length - 1));

        elements = new int[]{2, 3, 1};
        assertEquals(1, BinarySearch.findPivot(elements, 0, elements.length - 1));

        elements = new int[]{2, 3, 4, 5, -5, -3, 1};
        assertEquals(3, BinarySearch.findPivot(elements, 0, elements.length - 1));

        elements = new int[]{2, 3, 4, 5, 1};
        assertEquals(3, BinarySearch.findPivot(elements, 0, elements.length - 1));

        elements = new int[]{17, 19, 21, 23, 25, -8, -3, -1, 7, 8, 10, 12, 15};
        assertEquals(4, BinarySearch.findPivot(elements, 0, elements.length - 1));
    }
}