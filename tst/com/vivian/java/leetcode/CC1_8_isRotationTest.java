package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class CC1_8_isRotationTest {
    private CC1_8_isRotation solution = new CC1_8_isRotation();

    @Test
    public void test() {
        Assert.assertEquals(true, solution.isRotation("waterbottle","erbottlewat"));
    }
}
