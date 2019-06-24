package com.vivian.java.leetcode;
/* Write an algorithm to find the 'next'node(in-order successor)of given node
in a BST(Binary Search Tree).
You may assume that each node has a link to its parent

Clarification:in-order-successor: from left->current->right

Approach: from the given node,if it has rightSubTree,travesal the leftMostNode
          else,from the given node, travesal upward find the ascentor node which could
          determine the given node is on its left side

edgeCase:1, no rigth subtree,the next will be the parent node
            which can ensure its on the left side subtree


complexity:o(log n) ?  not clearly



*/
public class CCI4_6FindNextNode {
    public BiDirBiTreeNode<Integer> findNextNode(BiDirBiTreeNode<Integer> node) {
        if(node == null) {
            return null;
        }
        if(node.getRight() != null) {
            return mostLeftNode(node.getRight());
        } else {
            BiDirBiTreeNode<Integer> cur = node;
            BiDirBiTreeNode<Integer> parent = node.getParent();
            while(parent != null && parent.getLeft() != cur) {
                cur = parent;
                parent = cur.getParent();
            }
            return parent;
        }
    }

    public BiDirBiTreeNode<Integer> mostLeftNode(BiDirBiTreeNode<Integer> root) {
        if(root == null) {
            return null;
        }
        while(root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }
}
