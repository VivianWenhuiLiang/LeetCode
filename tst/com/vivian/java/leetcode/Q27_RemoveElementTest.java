package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q27_RemoveElementTest {
    private Q27_RemoveElement solution = new Q27_RemoveElement();

    @Test
    public void test() {
        Assert.assertEquals(2, solution.removeElement(new int[] { 3, 2, 2, 3 }, 3));
        Assert.assertEquals(4, solution.removeElement(new int[] { 1, 2, 2, 2, 3 }, 3));
        Assert.assertEquals(3, solution.removeElement(new int[] { 2, 4, 3, 5, 3 }, 3));
    }
}
