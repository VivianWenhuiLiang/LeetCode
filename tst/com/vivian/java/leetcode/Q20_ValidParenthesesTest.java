package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q20_ValidParenthesesTest {
    private Q20_ValidParentheses solution = new Q20_ValidParentheses();

    @Test
    public void test() {
        Assert.assertEquals(false, solution.validParentheses("([)]"));
        Assert.assertEquals(false, solution.validParentheses("(]"));
        Assert.assertEquals(true, solution.validParentheses("()(())(()())"));
    }
}
