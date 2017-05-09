package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q119_PascalsTriangleIITest {
    private Q119_PascalsTriangleII solution = new Q119_PascalsTriangleII();

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] { 1, 3, 3, 1 }, solution.pascalsTriangleII(3));
        Assert.assertArrayEquals(new int[] { 1, 1 }, solution.pascalsTriangleII(1));
        Assert.assertArrayEquals(new int[] { 1, 2, 1 }, solution.pascalsTriangleII(2));

    }
}
