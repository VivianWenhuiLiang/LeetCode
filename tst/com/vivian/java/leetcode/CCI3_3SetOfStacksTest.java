package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class CCI3_3SetOfStacksTest {
    private CCI3_3SetOfStacks solution = new CCI3_3SetOfStacks(3);


    @Test
    public void test() {
        Assert.assertEquals(true, solution.isEmpty());
        Assert.assertEquals(1, solution.push(1));
        Assert.assertEquals(2, solution.push(2));
        Assert.assertEquals(3, solution.push(3));

        Assert.assertEquals(4, solution.push(4));
        Assert.assertEquals(5, solution.push(5));
        Assert.assertEquals(6, solution.push(6));

        Assert.assertEquals(7, solution.push(7));
        Assert.assertEquals(8, solution.push(8));
        Assert.assertEquals(3, solution.size());


        Assert.assertEquals(8, (long)solution.pop());

        Assert.assertEquals(6, solution.popAt(1));
        Assert.assertEquals(7, (long)solution.pop());

    }
}