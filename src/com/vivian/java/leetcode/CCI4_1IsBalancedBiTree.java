package com.vivian.java.leetcode;

/* Implement a function to check if a binary tree is balanced.

Claritification: A balanced tree is defined to be a tree that
the heights of the two subtree of ANY node never differ by more than one
(-1<= height of rigt - left<=1)

Approach: recursivly determine each node must meet (-1<= height of rigt - left<=1)
   to make sure left tree is balanced,right tree is balanced

Edgecase: only determine the height difference is not enough,
         for example: we can have its subtree is balanced, but its left subtree isn't balanced

Complexity: runtime complexity o(n), n is the numbers all nodes of the tree(since each time exclude each layer of the nodes)
            the worse case(the tree only has one side(left or right)),n+(n-1)+(n-2)+...1   

*/
public class CCI4_1IsBalancedBiTree {
    public boolean isBlanced(BiTreeNode<Integer> root) {
        if(root == null) {
            return true;
        }
        int left_height = height(root.getLeft());
        int right_height = height(root.getRight());
        return Math.abs(left_height - right_height) <= 1 && isBlanced(root.getRight()) && isBlanced(root.getLeft());
    }

    public int height(BiTreeNode<Integer> root) {
        if(root == null) {
            return 0;
        }
        return Math.max(height(root.getLeft()), height(root.getRight())) + 1;
    }



    /*
    Approach 2: we use height() to check
    the node isBalanced as the same time check its height .
    each node we recursively get the height of left and right substree
    if subtree is balanced,then the height()will return actual height of subtree,
    if subtree isn's balanced ,it will return -1, then break immediately

    complexity: runtime complexity o(n),each node visited once
                memory complexity o(h),h is the height of the whole tree
    */
    public boolean isBalanced_2(BiTreeNode<Integer> root) {
        return getHeight(root) != -1;
    }
    public int getHeight(BiTreeNode<Integer> root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.getLeft());
        if(leftHeight == -1) {
            return -1;
        }
        int rightHeight = getHeight(root.getRight());
        if(rightHeight == -1) {
            return -1;
        }
        if(Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}

