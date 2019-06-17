package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class CCI3_1ArrayIntoThreeStacksTest {
    private CCI3_1ArrayIntoThreeStacks solution = new CCI3_1ArrayIntoThreeStacks();


    @Test
    public void test() {
        Assert.assertEquals(true, solution.isEmpty(1));
        Assert.assertEquals(1, solution.push(0, 1));
        Assert.assertEquals(4, solution.push(1, 4));
        Assert.assertEquals(8, solution.push(2, 8));
        Assert.assertEquals(false, solution.isEmpty(1));
        Assert.assertEquals(4, solution.pop(1));
        Assert.assertEquals(false, solution.isEmpty(2));
        Assert.assertEquals(0, solution.size(1));
    }
}
