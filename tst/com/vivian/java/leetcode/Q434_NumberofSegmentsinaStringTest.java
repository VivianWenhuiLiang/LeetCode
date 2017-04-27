package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q434_NumberofSegmentsinaStringTest {
    private Q434_NumberofSegmentsinaString solution = new Q434_NumberofSegmentsinaString();

    @Test
    public void test() {
        Assert.assertEquals(5, solution.numberOfSegmentSinaString("Hello, my name is John"));
        Assert.assertEquals(5, solution.numberOfSegmentSinaString("Hello: my name is John!"));
    }
}
