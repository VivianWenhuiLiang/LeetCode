package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class CCI3_2MinStackTest {
    private CCI3_2MinStack solution = new CCI3_2MinStack();


    @Test
    public void test() {
        Assert.assertEquals(true, solution.isEmpty());
        Assert.assertEquals(1, solution.push(1));
        Assert.assertEquals(4, solution.push(4));
        Assert.assertEquals(8, solution.push(8));
        Assert.assertEquals(false, solution.isEmpty());
        Assert.assertEquals(8, (Object)solution.pop());
        Assert.assertEquals(1, solution.getMin());
    }
}
