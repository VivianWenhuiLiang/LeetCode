package com.vivian.java.leetcode;
import org.junit.Assert;
import org.junit.Test;


public class CCI4_9FindPathsWithSumTest {
    CCI4_9FindPathsWithSum solution = new CCI4_9FindPathsWithSum();
    BiTreeNode<Integer> n7 = new BiTreeNode<>(7, null, null);
    BiTreeNode<Integer> n8 = new BiTreeNode<>(8, null, null);
    BiTreeNode<Integer> n12 = new BiTreeNode<>(12, null, null);
    BiTreeNode<Integer> n11 = new BiTreeNode<>(11, null, null);
    BiTreeNode<Integer> n4 = new BiTreeNode<>(4, null, null);
    BiTreeNode<Integer> n6 = new BiTreeNode<>(6, n7, n8);
    BiTreeNode<Integer> n2 = new BiTreeNode<>(2, n12, n6);
    BiTreeNode<Integer> n3 = new BiTreeNode<>(3, n11, n4);
    BiTreeNode<Integer> n1 = new BiTreeNode<>(1, n2, n3);

    @Test
    public void test() {
        solution.findSum(n1, 15);
        solution.findSum(n1, 15);
    }
}
