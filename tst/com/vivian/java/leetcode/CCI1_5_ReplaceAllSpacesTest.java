package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class CCI1_5_ReplaceAllSpacesTest {
    private ReplaceAllSpaces solution = new ReplaceAllSpaces();

    @Test
    public void test() {
        Assert.assertArrayEquals(new char[] {'a', '%', '2', '0', 'b', '%', '2', '0', '\0'}, solution.replaceSpaces(new char[] {'a', ' ', 'b', ' ', '\0', '\0', '\0', '\0', '\0'}));
    }
}
