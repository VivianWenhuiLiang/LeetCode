package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q345_ReverseVowelsofaStringTest {
    private Q345_ReverseVowelsofaString solution = new Q345_ReverseVowelsofaString();

    @Test
    public void test() {
        Assert.assertEquals("holle", solution.reverseVowelsofaString("hello"));
        Assert.assertEquals("leotcede", solution.reverseVowelsofaString("leetcode"));
    }
}
