package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class CCI1_7_SetZerosTest{
    private CCI1_7_SetZeros solution = new CCI1_7_SetZeros();

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[][] {{0,0},{0,2}}, solution.setZeros (new int[ ][ ]{{0,1},{2,2}}));
    }
}