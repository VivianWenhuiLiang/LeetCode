package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q_551StudentAttendanceRecordI {
    private Q551_StudentAttendanceRecordI solution = new Q551_StudentAttendanceRecordI();

    @Test
    public void test() {
        Assert.assertEquals(true, solution.beRewarded("PPALLP"));
        Assert.assertEquals(false, solution.beRewarded("PPALLL"));
    }
}
