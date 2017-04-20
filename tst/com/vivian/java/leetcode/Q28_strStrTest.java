package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q28_strStrTest {
    private Q28_strStr solution = new Q28_strStr();

    @Test
    public void test() {
        Assert.assertEquals(0, solution.strStr("Hello World!", "He"));
        Assert.assertEquals(6, solution.strStr("Hello World!", "Wor"));
        Assert.assertEquals(-1, solution.strStr("Hello World!", "ah"));
        Assert.assertEquals(11, solution.strStr("Hello World!", "!"));
    }
}
