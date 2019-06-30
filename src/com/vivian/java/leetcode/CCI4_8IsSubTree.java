package com.vivian.java.leetcode;
/* You have two very large BiTree: T1,with millions of nodes
                                   T2,with hundres of nodes
   create an algrithm to decide T2 is a subtree of T1.

   Clarification:

   Approach: travesal Tree1,find the node match the root of Tree2
             then call a Match method to check T2 is T1's subtree

   EdgeCase: 1,T1 tree not empty,but T2 is empty,return true():The empty tree is always subtree
             2,in method treeMatch while two tree is comparing,
             same side node of each tree are null,return true
             only one node is null,another isn't,return false


   Complexity: seach the node match the root of T2,assumpt is n
               then call method treeMatch(recursion), each time need n*k(k is the nodes of T2 )
               so the total runtime complexity is o(n+n*k)
               since we don't need to new extra space ,so memory complexity o(1) for constant

   */
public class CCI4_8IsSubTree {
    public boolean isSubTree(BiTreeNode<Integer> root1, BiTreeNode<Integer> root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 != null && root2 == null) {
            return true;//an empty tree always is a subtree of another
        }
        if( root1 == null) {//travesal T1 not found one node match
            return false;
        }
        if(root1.getData().equals(root2.getData())) {
            if (isSubTree(root1.getLeft(), root2.getLeft()) && isSubTree(root1.getRight(), root2.getRight())) {
                return true;
            }
        }
        return isSubTree(root1.getLeft(), root2) || isSubTree(root1.getRight(), root2);
    }
}