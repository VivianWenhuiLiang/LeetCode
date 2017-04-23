package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q125_ValidPalindromeTest {
    private Q125_ValidPalindrome solution = new Q125_ValidPalindrome();

    @Test
    public void test() {
        Assert.assertEquals(true, solution.ValidPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertEquals(false, solution.ValidPalindrome("race a car"));
    }
}
