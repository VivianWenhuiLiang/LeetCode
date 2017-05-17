package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q169_MajorityElementTest {
    private Q169_MajorityElement solution = new Q169_MajorityElement();

    @Test
    public void test() {
        Assert.assertEquals(2, solution.majorityElement(new int[] { 2, 1, 2, 3, 2 }));
        Assert.assertEquals(1, solution.majorityElement(new int[] { 1, 2, 3, 1, 1, 1, 1, 1 }));
    }

    public void testException() {
        boolean hasThrow = false;
        try {
            solution.majorityElement(new int[] { 1, 2, 3, 4 });
        } catch (IllegalArgumentException e) {
            hasThrow = true;
        }
        if (!hasThrow) {
            Assert.fail("didn't throw");
        }

        hasThrow = false;
        try {
            solution.majorityElement(new int[] { 2, 2, 3, 4, 2, 3, 3 });
        } catch (IllegalArgumentException e) {
            hasThrow = true;
        }
        if (!hasThrow) {
            Assert.fail("didn't throw");
        }

    }
}
