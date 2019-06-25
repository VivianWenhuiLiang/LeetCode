package com.vivian.java.leetcode;
import java.lang.Integer;
/* Implement a faction to check if a binary tree is a BST(BinarySearchTree)

Calritification: BST's definition is left <=current < right

Approach: 1, By the definition ,All the left nodes must less than or equals current node,
             current node must less than All the right nodes
          2, while we travesal we could passing down the Max,and the Min
          3, For left subtree,the Max(the current node's value) get update by passing down
             For right subtree,the Min(current node's value) get update by passing down
edgeCase:


complexity: by this approach ,runtime complexity will be O(n),each node visited once

           memory complexity:o(1)
*/
public class CCI4_5CheckBST {
    public boolean checkBST(BiTreeNode<Integer> root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean checkBST(BiTreeNode<Integer> root, int min, int max) {
        if(root == null) {
            return true;
        }
        if(root.getData() < min || root.getData() >= max) {
            return false;
        }
        return checkBST(root.getLeftNode(), min, root.getData()) &&
               checkBST(root.getRightNode(), root.getData(), max);
    }
}