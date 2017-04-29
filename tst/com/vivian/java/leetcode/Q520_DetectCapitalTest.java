package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q520_DetectCapitalTest {
    private Q520_DetectCapital solution = new Q520_DetectCapital();

    @Test
    public void test() {
        Assert.assertEquals(true,solution.detectCapital("USA"));
        Assert.assertEquals(false, solution.detectCapital("FlaG"));
        Assert.assertEquals(true,solution.detectCapital("abhhj"));
    }
}
