package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class CCI4_3ArrayToBSTTest {
    CCI4_3ArrayToBST solution = new CCI4_3ArrayToBST();
    BiTreeNode<Integer>n1 = new BiTreeNode<>(1, null, null);
    BiTreeNode<Integer>n5 = new BiTreeNode<>(5, null, null);
    BiTreeNode<Integer>n8 = new BiTreeNode<>(8, null, null);
    BiTreeNode<Integer>n3 = new BiTreeNode<>(3, null, null);
    BiTreeNode<Integer>n7 = new BiTreeNode<>(7, null, n8);
    BiTreeNode<Integer>n6 = new BiTreeNode<>(6, n5, n7);
    BiTreeNode<Integer>n2 = new BiTreeNode<>(2, n1, n3);
    BiTreeNode<Integer>n4 = new BiTreeNode<>(4, n2, n6);



    int[] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8};

    public boolean treeEquals(BiTreeNode<Integer> root1, BiTreeNode<Integer> root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || ro
            ot2 == null) {
            return root1 == root2;
        }
        if(root1.getData() != root2.getData()) {
            return false;
        }
        return root1.getData() .equals(root2.getData())
               && treeEquals(root1. getLeftNode(), root2. getLeftNode())
               && treeEquals(root1.getRightNode(), root2.getRightNode());
    }

    @Test
    public void test() {
        Assert.assertTrue(sameTree(solution.ToBST(arr), n4));
    }
}
