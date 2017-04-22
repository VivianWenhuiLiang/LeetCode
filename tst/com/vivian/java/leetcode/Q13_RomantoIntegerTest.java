package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q13_RomantoIntegerTest {
    private Q13_RomantoInteger solution = new Q13_RomantoInteger();

    @Test
    public void test() {
        Assert.assertEquals(199, solution.romanToInteger("CXCIX"));
        Assert.assertEquals(102, solution.romanToInteger("CII"));
    }
}
