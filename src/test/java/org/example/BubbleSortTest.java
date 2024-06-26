package org.example;

import org.example.BuggySort.BBubbleSort;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    //Bubble Sort

//  the test for the correct implementation of the sorting algorithm
//    @Test
//    public void testBubbleSort() {
//        BubbleSort sorter = new BubbleSort();
//        int[] input = {64, 34, 25, 12, 22, 11, 90};
//        int[] expected = {11, 12, 22, 25, 34, 64, 90};
//        sorter.bubbleSort(input);
//        assertArrayEquals(expected, input);
//    }


    @Test
    public void testBuggyBubbleSort() {
        BBubbleSort sorter = new BBubbleSort();
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        sorter.bubbleSort(input);
        assertArrayEquals("Array should be correctly sorted.", expected, input);
    }

    @Test
    public void testBubbleSortOrderedArray() {
        BBubbleSort sorter = new BBubbleSort();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        sorter.bubbleSort(input);
        assertArrayEquals("Array should remain unchanged.", expected, input);
    }

    @Test
    public void testBubbleSortReverseOrdered() {
        BBubbleSort sorter = new BBubbleSort();
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        sorter.bubbleSort(input);
        assertArrayEquals("Array should be sorted in ascending order.", expected, input);
    }

    @Test
    public void testBubbleSortAllSameElements() {
        BBubbleSort sorter = new BBubbleSort();
        int[] input = {2, 2, 2, 2, 2};
        int[] expected = {2, 2, 2, 2, 2};
        sorter.bubbleSort(input);
        assertArrayEquals("Array of identical elements should remain unchanged.", expected, input);
    }

    @Test
    public void testBubbleSortWithNegatives() {
        BBubbleSort sorter = new BBubbleSort();
        int[] input = {-3, -1, -2, -5, -4};
        int[] expected = {-5, -4, -3, -2, -1};
        sorter.bubbleSort(input);
        assertArrayEquals("Array should be sorted in ascending order with negative values.", expected, input);
    }

    @Test
    public void testBubbleSortEmptyArray() {
        BBubbleSort sorter = new BBubbleSort();
        int[] input = {};
        int[] expected = {};
        sorter.bubbleSort(input);
        assertArrayEquals("Empty array should remain unchanged.", expected, input);
    }
}

