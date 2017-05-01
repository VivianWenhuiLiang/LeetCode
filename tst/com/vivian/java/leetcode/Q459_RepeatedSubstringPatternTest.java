package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q459_RepeatedSubstringPatternTest {
    private Q459_RepeatedSubstringPattern solution = new Q459_RepeatedSubstringPattern();

    @Test
    public void test() {
        Assert.assertFalse(solution.repeatedSubstringPattern("Hello, my name is John"));
        Assert.assertTrue(solution.repeatedSubstringPattern("abab"));
        Assert.assertFalse(solution.repeatedSubstringPattern("abcabcab"));
        Assert.assertFalse(solution.repeatedSubstringPattern("abababc"));
        Assert.assertTrue(solution.repeatedSubstringPattern("abcdabcd"));
    }
}
