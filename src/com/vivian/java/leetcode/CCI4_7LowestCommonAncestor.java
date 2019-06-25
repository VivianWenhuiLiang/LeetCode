package com.vivian.java.leetcode;
/*Design an algrithm and write code to find the first common sncester
 of two nodes in a Binary Tree. Aviod storing additional nodes in a data structure.
 NOTE:This is not necessarily a BST.

 Clarification: 1, return null if both nodes are not in the tree(OK).
                2, return ascentor one,if one node is another's ascentor.

 EdgeCase: 1,both nodes in the left side.
           2,both nodes in the right side.
           3,both nodes in different side.
Approach: if both nodes on the left side Recursively left to find the common ascentor.
          same way if both nodes on the right side.
          if they're in diff side,Recursive the root,
          until they are no longer on the same side,return the first node(ascentor)split them .

complexity:o(n) since each node visited once

*/
public class CCI4_7LowestCommonAncestor {
    public BiTreeNode<Integer> commAncestor(BiTreeNode<Integer> root, BiTreeNode<Integer>no1, BiTreeNode<Integer> no2) {
        if(!covers(root, no1) || !covers(root, no2)) { //ensure both nodes in the tree
            return null;
        }
        return firstAncestor(root, no1, no2);
    }

    public BiTreeNode<Integer> firstAncestor(BiTreeNode<Integer>root, BiTreeNode<Integer>no1, BiTreeNode<Integer>no2) {
        if(root == null) {
            return null;
        }
        if(root == no1 || root == no2) {
            return root;
        }
        boolean no1_left = covers(root.getLeft(), no1);
        boolean no2_left = covers(root.getLeft(), no2);
        if(no1_left != no2_left) {
            return root;//they're in difference side,first node(ascentor to split no1 & no2)
        }
        BiTreeNode<Integer> child_side = no1_left ? root.getLeft() : root.getRight();
        return firstAncestor(child_side, no1, no2);
    }

    public boolean covers(BiTreeNode<Integer> root, BiTreeNode<Integer> node) {
        if(root == null) {
            return false;
        }
        if(root == node) {
            return true;
        }
        return covers(root.getLeft(), node) || covers(root.getRight(), node);
    }
}