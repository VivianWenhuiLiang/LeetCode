package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q521_LongestUncommonSubsequenceITest {
    private Q521_LongestUncommonSubsequenceI solution = new Q521_LongestUncommonSubsequenceI();

    @Test
    public void test() {
        Assert.assertEquals(3, solution.longestUncommonSubsequenceI("aba", "cbc"));
        Assert.assertEquals(6, solution.longestUncommonSubsequenceI("abcdef", "ab"));
        Assert.assertEquals(2, solution.longestUncommonSubsequenceI("ab", "ba"));
        Assert.assertEquals(-1, solution.longestUncommonSubsequenceI("ab", "ab"));
    }
}
