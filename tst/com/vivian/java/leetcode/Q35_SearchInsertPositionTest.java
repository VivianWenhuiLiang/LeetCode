package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q35_SearchInsertPositionTest {
    private Q35_SearchInsertPosition solution = new Q35_SearchInsertPosition();

    @Test
    public void test() {
        Assert.assertEquals(2, solution.searchInsertPosition(new int[] { 1, 3, 5, 6 }, 5));
        Assert.assertEquals(1, solution.searchInsertPosition(new int[] { 1, 3, 5, 6 }, 2));
        Assert.assertEquals(4, solution.searchInsertPosition(new int[] { 1, 3, 5, 6 }, 7));
        Assert.assertEquals(0, solution.searchInsertPosition(new int[] { 1, 3, 5, 6 }, 0));
    }
}
