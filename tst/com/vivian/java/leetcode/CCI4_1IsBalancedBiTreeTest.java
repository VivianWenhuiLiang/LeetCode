package com.vivian.java.leetcode;
import org.junit.Assert;
import org.junit.Test;

public class CCI4_1IsBalancedBiTreeTest {
    CCI4_1IsBalancedBiTree solution = new CCI4_1IsBalancedBiTree();
    BiTreeNode<Integer> i = new BiTreeNode<>(9, null, null);
    BiTreeNode<Integer> h = new BiTreeNode<>(8, null, null);
    BiTreeNode<Integer> g = new BiTreeNode<>(7, h, i);
    BiTreeNode<Integer> d = new BiTreeNode<>(4, g, null);
    BiTreeNode<Integer> e = new BiTreeNode<>(5, null, null);
    BiTreeNode<Integer> b = new BiTreeNode<>(2, d, e);
    BiTreeNode<Integer> f = new BiTreeNode<>(6, null, null);
    BiTreeNode<Integer> c = new BiTreeNode<>(3, f, null);
    BiTreeNode<Integer> a = new BiTreeNode<>(1, b, c);

    BiTreeNode<Integer>i5 = new BiTreeNode<>(5, null, null);
    BiTreeNode<Integer>i4 = new BiTreeNode<>(4, null, null);
    BiTreeNode<Integer>i3 = new BiTreeNode<>(3, null, null);
    BiTreeNode<Integer>i2 = new BiTreeNode<>(2, i4, i5);
    BiTreeNode<Integer>i1 = new BiTreeNode<>(1, i2, i3);
    @Test
    public void test() {
        Assert.assertFalse(solution.isBlanced(a));
        Assert.assertFalse(solution.isBalanced_2(a));

        Assert.assertTrue(solution.isBlanced(i1));
        Assert.assertTrue(solution.isBalanced_2(i1));
    }
}
