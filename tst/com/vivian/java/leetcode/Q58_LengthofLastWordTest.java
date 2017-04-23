package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q58_LengthofLastWordTest {
    private Q58_LengthofLastWord solution = new Q58_LengthofLastWord();

    @Test
    public void test() {
        Assert.assertEquals(5, solution.LengthofLastWord("Hello World"));
        Assert.assertEquals(0, solution.LengthofLastWord("Sing,good!"));
    }
}
