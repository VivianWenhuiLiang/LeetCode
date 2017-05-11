package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q283_MoveZeroesTest {
    private Q283_MoveZeroes solution = new Q283_MoveZeroes();

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, solution.moveZeroes(new int[] { 0, 1, 0, 3, 12 }));
        Assert.assertArrayEquals(new int[] { 12, 0, 0, 0, 0 }, solution.moveZeroes(new int[] { 0, 0, 0, 0, 12 }));
        Assert.assertArrayEquals(new int[] { 3, 12, 0, 0, 0 }, solution.moveZeroes(new int[] { 0, 0, 0, 3, 12 }));
    }
}
