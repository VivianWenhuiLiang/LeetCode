package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q344_ReverseStringTest {
    private Q344_ReverseString solution = new Q344_ReverseString();

    @Test
    public void test() {
        Assert.assertEquals("olleh", solution.reverseString("hello"));
        Assert.assertEquals(null, solution.reverseString(""));
    }
}
