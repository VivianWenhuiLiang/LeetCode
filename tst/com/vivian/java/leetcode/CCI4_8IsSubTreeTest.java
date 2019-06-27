package com.vivian.java.leetcode;
import org.junit.Assert;
import org.junit.Test;


public class CCI4_8IsSubTreeTest {
    CCI4_8IsSubTree solution = new CCI4_8IsSubTree();
    BiTreeNode<Integer> n9 = new BiTreeNode<>(9, null, null);
    BiTreeNode<Integer> n10 = new BiTreeNode<>(10, null, null);
    BiTreeNode<Integer> n8 = new BiTreeNode<>(8, n9, n10);
    BiTreeNode<Integer> n6 = new BiTreeNode<>(6, null, null);
    BiTreeNode<Integer> n7 = new BiTreeNode<>(7, null, null);
    BiTreeNode<Integer> n4 = new BiTreeNode<>(4, n8, null);
    BiTreeNode<Integer> n5 = new BiTreeNode<>(5, null, null);
    BiTreeNode<Integer> n2 = new BiTreeNode<>(2, n4, n5);
    BiTreeNode<Integer> n3 = new BiTreeNode<>(3, n6, n7);
    BiTreeNode<Integer> n1 = new BiTreeNode<>(1, n2, n3);

    BiTreeNode<Integer> c = new BiTreeNode<>(10, null, null);
    BiTreeNode<Integer> b = new BiTreeNode<>(8, null, c);
    BiTreeNode<Integer> a = new BiTreeNode<>(4, b, null);

    BiTreeNode<Integer> no0 = new BiTreeNode<>(0, null, null);
    BiTreeNode<Integer> no5 = new BiTreeNode<>(5, null, no0);
    BiTreeNode<Integer> no4 = new BiTreeNode<>(4, null, null);
    BiTreeNode<Integer> no2 = new BiTreeNode<>(2, no4, no5);

    @Test
    public void test() {
        Assert.assertTrue(solution.isSubTree(n1, a));
        Assert.assertFalse(solution.isSubTree(n1, no2));
    }
}
