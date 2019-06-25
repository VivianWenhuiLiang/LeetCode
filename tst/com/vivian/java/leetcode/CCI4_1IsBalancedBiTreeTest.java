package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class CCI4_1IsBalancedBiTreeTest {
    CCI4_1IsBalancedBiTree solution = new CCI4_1IsBalancedBiTree();
    BiTreeNode<Integer>I = new BiTreeNode<>(9, null, null);
    BiTreeNode<Integer>H = new BiTreeNode<>(8, null, null);
    BiTreeNode<Integer>G = new BiTreeNode<>(7, H, I);
    BiTreeNode<Integer>D = new BiTreeNode<>(4, G, null);
    BiTreeNode<Integer>E = new BiTreeNode<>(5, null, null);
    BiTreeNode<Integer>B = new BiTreeNode<>(2, D, E);
    BiTreeNode<Integer>F = new BiTreeNode<>(6, null, null);
    BiTreeNode<Integer>C = new BiTreeNode<>(3, F, null);
    BiTreeNode<Integer>A = new BiTreeNode<>(1, B, C);

    BiTreeNode<Integer>I5 = new BiTreeNode<>(5, null, null);
    BiTreeNode<Integer>I4 = new BiTreeNode<>(4, null, null);
    BiTreeNode<Integer>I3 = new BiTreeNode<>(3, null, null);
    BiTreeNode<Integer>I2 = new BiTreeNode<>(2, I4, I5);
    BiTreeNode<Integer>I1 = new BiTreeNode<>(1, I2, I3);
    @Test
    public void test() {
        Assert.assertFalse(solution.isBlanced(A));
        Assert.assertFalse(solution.isBalanced_2(A));

        Assert.assertTrue(solution.isBlanced(I1));
        Assert.assertTrue(solution.isBalanced_2(I1));
    }
}
