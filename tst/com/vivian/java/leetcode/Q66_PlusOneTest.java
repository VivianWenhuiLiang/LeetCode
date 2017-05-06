package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q66_PlusOneTest {
    private Q66_PlusOne solution = new Q66_PlusOne();

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] { 2, 8, 0 }, solution.plusOne(new int[] { 2, 7, 9 }));
        Assert.assertArrayEquals(new int[] { 1, 0, 0, 0 }, solution.plusOne(new int[] { 9, 9, 9 }));
        Assert.assertArrayEquals(new int[] { 1 }, solution.plusOne(new int[] { 0 }));
    }
}
