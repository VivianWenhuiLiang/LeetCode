package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q14_LongestCommonPrefixTest {
    private Q14_LongestCommonPrefix solution = new Q14_LongestCommonPrefix();

    @Test
    public void test() {
        Assert.assertEquals("ab", solution.longestCommonPrefix(new String[] { "abab", "aba", "abc" }));
        Assert.assertEquals("", solution.longestCommonPrefix(new String[] { "a", "b", "c" }));
        Assert.assertEquals("ab", solution.longestCommonPrefix(new String[] { "abc", "abc", "ab" }));
    }
}
