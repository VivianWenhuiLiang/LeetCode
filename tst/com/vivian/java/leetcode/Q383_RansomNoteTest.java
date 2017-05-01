package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q383_RansomNoteTest {
    private Q383_RansomNote solution = new Q383_RansomNote();

    @Test
    public void test() {
        Assert.assertEquals(false, solution.ransonNote("a", "b"));
        Assert.assertEquals(true, solution.ransonNote("aa", "aab"));
        Assert.assertEquals(false, solution.ransonNote("aa", "aba"));
    }
}
