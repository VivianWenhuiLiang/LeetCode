package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q557_ReverseWordsTest {
    private Q557_ReverseWords solution = new Q557_ReverseWords();

    @Test
    public void test() {
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseAll("Let's take LeetCode contest").toString());
        Assert.assertEquals("ecar a rac", solution.reverseAll("race a car").toString());
    }
}
