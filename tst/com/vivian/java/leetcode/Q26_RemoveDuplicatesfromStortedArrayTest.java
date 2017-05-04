package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q26_RemoveDuplicatesfromStortedArrayTest {
    private Q26_RemoveDuplicatesfromSortedArray solution = new Q26_RemoveDuplicatesfromSortedArray();

    @Test
    public void test() {
        Assert.assertEquals(2, solution.removeDuplicatesfromSortedArray(new int[] { 1, 1, 1, 2 }, 4));
        Assert.assertEquals(3, solution.removeDuplicatesfromSortedArray(new int[] { 1, 2, 2, 2, 3 }, 5));
    }
}
