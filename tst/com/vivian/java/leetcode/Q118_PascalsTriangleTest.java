package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q118_PascalsTriangleTest {
    private Q118_PascalsTriangle solution = new Q118_PascalsTriangle();

    @Test
    public void test() {
        System.out.println("Q181_PascalsTriangleTest test");
        Assert.assertArrayEquals(new int[][] { { 1 }, { 1, 1 }, { 1, 2, 1 }, { 1, 3, 3, 1 }, { 1, 4, 6, 4, 1 } },
                solution.pascalsTriangle(5));

    }
}
