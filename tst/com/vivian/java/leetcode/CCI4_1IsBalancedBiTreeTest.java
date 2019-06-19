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

    @Test
    public void test() {
        Assert.assertFalse(solution.isBlanced(A));
    }
}
