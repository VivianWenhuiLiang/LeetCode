package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q541_ReverseStringIITest {
    private Q541_ReverseStringII solution = new Q541_ReverseStringII();

    @Test
    public void test() {
        Assert.assertEquals("bacdfeg",solution.reverseStringII("abcdefg",2));
        Assert.assertEquals("bacdfegd", solution.reverseStringII("abcdefgd",2));
    }
}
