package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q88_MergeSortedArrayTest {
    private Q88_MergeSortedArray solution = new Q88_MergeSortedArray();

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] { 1, 2, 3, 5, 5, 6, 7, 7, 8, 9 }, solution
                .mergeSortedArray(new int[] { 1, 3, 5, 7, 9, 0, 0, 0, 0, 0 }, 5, new int[] { 2, 5, 6, 7, 8 }, 5));
        Assert.assertArrayEquals(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 }, solution
                .mergeSortedArray(new int[] { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0 }, 5, new int[] { 1, 2, 3, 4, 5 }, 5));
        Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                solution.mergeSortedArray(new int[] { 1, 4, 5, 9, 0, 0, 0, 0, 0 }, 4, new int[] { 2, 3, 6, 7, 8 }, 5));
        Assert.assertArrayEquals(new int[] { 1, 2 },
                solution.mergeSortedArray(new int[] { 1, 0 }, 1, new int[] { 2 }, 1));
        Assert.assertArrayEquals(new int[] { 1, 2 },
                solution.mergeSortedArray(new int[] { 2, 0 }, 1, new int[] { 1 }, 1));

    }
}
