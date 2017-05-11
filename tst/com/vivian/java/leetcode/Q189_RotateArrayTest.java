package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q189_RotateArrayTest {
    private Q189_RotateArray solution = new Q189_RotateArray();

    @Test

    public void test() {
        Assert.assertArrayEquals(new int[] { 15, 2, 7, 11 }, solution.rotateArray(new int[] { 2, 7, 11, 15 }, 9));
        Assert.assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 },
                solution.rotateArray(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3));
        Assert.assertArrayEquals(new int[] { 4, 5, 6, 7, 1, 2, 3 },
                solution.rotateArray(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 4));
    }
}
