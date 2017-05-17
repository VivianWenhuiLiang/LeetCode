package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q219_ContainsDuplicateIITest {
    private Q219_ContainsDuplicateII solution = new Q219_ContainsDuplicateII();

    @Test
    public void test() {
        Assert.assertEquals(false, solution.containDuplicateII(new int[] { 2, 7, 11, 15 }, 4));
        Assert.assertEquals(false, solution.containDuplicateII(new int[] { 2 }, 2));
        Assert.assertEquals(true, solution.containDuplicateII(new int[] { 2, 3, 4, 5, 6, 2 }, 5));
        Assert.assertEquals(true, solution.containDuplicateII(new int[] { 2, 3, 4, 3, 2 }, 2));
    }
}
