package org.example;

import org.example.BuggySort.BBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySortTest {


//Binary search

//    correct implementation test
//    @Test
//    public void testBinarySearch() {
//        BinarySearch searcher = new BinarySearch();
//        int[] data = {1, 5, 7, 8, 9, 10};
//        int target = 9;
//        int expected = 4;
//        int result = searcher.binarySearch(data, target);
//        assertArrayEquals(new int[]{expected}, new int[]{result});
//    }

    @Test
    public void testBuggyBinarySearch() {
        BBinarySearch searcher = new BBinarySearch();
        int[] data = {1, 5, 7, 8, 9, 10};
        int target = 9;
        int expected = 4;
        int result = searcher.binarySearch(data, target);
        assertEquals("Should find element at index 4.", expected, result);
    }

    @Test
    public void testBinarySearchFoundAtMiddle() {
        BBinarySearch searcher = new BBinarySearch();
        int[] data = {1, 3, 5, 7, 9};
        int target = 5;
        int expected = 2;
        int result = searcher.binarySearch(data, target);
        assertEquals("Should find element at the middle index.", expected, result);
    }

    @Test
    public void testBinarySearchFoundAtStart() {
        BBinarySearch searcher = new BBinarySearch();
        int[] data = {1, 3, 5, 7, 9};
        int target = 1;
        int expected = 0;
        int result = searcher.binarySearch(data, target);
        assertEquals("Should find element at the start index.", expected, result);
    }

    @Test
    public void testBinarySearchFoundAtEnd() {
        BBinarySearch searcher = new BBinarySearch();
        int[] data = {1, 3, 5, 7, 9};
        int target = 9;
        int expected = 4;
        int result = searcher.binarySearch(data, target);
        assertEquals("Should find element at the last index.", expected, result);
    }

    @Test
    public void testBinarySearchNotFound() {
        BBinarySearch searcher = new BBinarySearch();
        int[] data = {1, 3, 5, 7, 9};
        int target = 4;
        int expected = -1;
        int result = searcher.binarySearch(data, target);
        assertEquals("Should not find element and return -1.", expected, result);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        BBinarySearch searcher = new BBinarySearch();
        int[] data = {};
        int target = 3;
        int expected = -1;
        int result = searcher.binarySearch(data, target);
        assertEquals("Should handle empty array by returning -1.", expected, result);
    }
}
