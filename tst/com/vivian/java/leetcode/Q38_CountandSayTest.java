package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q38_CountandSayTest {
    private Q38_CountandSay solution = new Q38_CountandSay();

    @Test
    public void test() {
        Assert.assertEquals("111221", solution.countandSay(4).toString());
        Assert.assertEquals("1211", solution.countandSay(3).toString());
        Assert.assertEquals("1", solution.countandSay(0).toString());
    }
}
