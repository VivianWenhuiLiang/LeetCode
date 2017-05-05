package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q53_MaximumSubarrayTest {
    private Q53_MaximumSubarray solution = new Q53_MaximumSubarray();

    @Test
    public void test() {
        Assert.assertEquals(6, solution.maximumSubarray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
        Assert.assertEquals(15, solution.maximumSubarray(new int[] { 1, 3, 5, 6 }));
        Assert.assertEquals(7, solution.maximumSubarray(new int[] { -3, 7, -4 }));
        Assert.assertEquals(-1, solution.maximumSubarray(new int[] {-2, -1, -3 }));
    }
}
