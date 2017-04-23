package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q67_AddBinaryTest {
    private Q67_AddBinary solution = new Q67_AddBinary();

    @Test
    public void test() {
        Assert.assertEquals(null, solution.sumOfBinary(null, "1"));
        Assert.assertEquals("100", solution.sumOfBinary("11", "1"));
        Assert.assertEquals("11", solution.sumOfBinary("10", "1"));
    }
}
