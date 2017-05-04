package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q1_TwoSumTest {
    private Q1_TwoSum solution = new Q1_TwoSum();

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
        Assert.assertArrayEquals(new int[] { 1, 2 }, solution.twoSum(new int[] { 2, 7, 11, 15 }, 18));
    }
}
