package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class CCI1_6_InplaceRotateMatrixTest{
    private CCI1_6_InplaceRotateMatrix solution = new CCI1_6_InplaceRotateMatrix();

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[][] {{3,1},{4,2}}, solution.inplaceRotateMatrix (new int[ ][ ]{{1,2},{3,4}}, 2));
    }
}