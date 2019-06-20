package com.vivian.java.leetcode;
import org.junit.Assert;
import org.junit.Test;
import java.lang.Integer;



public class CCI4_5CheckBSTTest {
    CCI4_5CheckBST solution = new CCI4_5CheckBST();
    BiTreeNode<Integer>n1 = new BiTreeNode<>(1, null, null);
    BiTreeNode<Integer>n5 = new BiTreeNode<>(6, null, null);
    BiTreeNode<Integer>n8 = new BiTreeNode<>(8, null, null);
    BiTreeNode<Integer>n3 = new BiTreeNode<>(3, null, null);
    BiTreeNode<Integer>n7 = new BiTreeNode<>(7, null, n8);
    BiTreeNode<Integer>n6 = new BiTreeNode<>(6, n5, n7);
    BiTreeNode<Integer>n2 = new BiTreeNode<>(2, n1, n3);
    BiTreeNode<Integer>n4 = new BiTreeNode<>(4, n2, n6);






    @Test
    public void test() {
        Assert.assertFalse(solution.checkBST(n4));
    }
}
