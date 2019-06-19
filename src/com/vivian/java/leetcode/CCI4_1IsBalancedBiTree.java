package com.vivian.java.leetcode;

/* Implement a function to check if a binary tree is balanced.

Claritification: A balanced tree is defined to be a tree that
the heights of the two subtree of ANY node never differ by more than one
(-1<= height of rigt - left<=1)

Approach: recursivly determine each node must meet (-1<= height of rigt - left<=1)
   to make sure left tree is balanced,right tree is balanced

Edgecase: only determine the height difference is not enough,
         for example: we can have its subtree is balanced, but its left subtree isn't balanced

Complexity: runtime complexity o(n^2),One each node, we recurse its entire subTree(means one each node,we called height() repeatly)

*/
public class CCI4_1IsBalancedBiTree {
    public boolean isBlanced(BiTreeNode<Integer> root) {
        if(root == null) {
            return true;
        }
        int left_height = height(root.getLeftNode());
        int right_height = height(root.getRightNode());
        if(Math.abs(left_height - right_height) > 1) {
            return false;
        } else {
            return isBlanced(root.getRightNode()) && isBlanced(root.getLeftNode());
        }
    }

    public int height(BiTreeNode<Integer> root) {
        if(root == null) {
            return 0;
        }
        return Math.max(height(root.getLeftNode()), height(root.getRightNode())) + 1;
    }
}

/*
Approach 2: we use height() to check
the node isBalanced as the same time check its height .
each node we recursively get the height of left and right substree
if subtree is balanced,then the height()will return actual height of subtree,
if subtree isn's balanced ,it will return -1, then break immediately

complexity: runtime complexity o(n),each node visited once
            memory complexity o(h),h is the height of the whole tree

public boolean isBalanced(TreeNode root){
    return getHeight(root)!=-1;
}
public int getHeight(TreeNode root){
    if(root==null){
    return 0;
    }
    int leftHeight=getHeight(root.left);
    if(leftHeight==-1){
    return -1;
    }
    int rightHeight=getHeight(root.right);
    if(eightHeight==-1){
    return -1;
    }
    if(Math.abs(leftHeight-rightHeight)>1){
    return -1;
    }else{
    return Math.max(leftHeight,rightHeight)+1;
    }
}
*/

