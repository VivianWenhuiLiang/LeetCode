package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q217_ContainsDuplicateTest {
    private Q217_ContainsDuplicate solution = new Q217_ContainsDuplicate();

    @Test
    public void test() {
        Assert.assertEquals(false, solution.cotainsDuplicate(new int[] { 2, 7, 11, 15 }));
        Assert.assertEquals(false, solution.cotainsDuplicate(new int[] { 2 }));
        Assert.assertEquals(true, solution.cotainsDuplicate(new int[] { 2, 3, 4, 5, 6, 2 }));
        Assert.assertEquals(true, solution.cotainsDuplicate(new int[] { 2, 3, 4, 3, 2 }));
    }
}
