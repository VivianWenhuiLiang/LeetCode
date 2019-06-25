package com.vivian.java.leetcode;
/* Given a sorted(increasing order)array with unique integer elements,
write a algorithm to create a binary seach tree with minimal height.

A Binary Search tree is a tree data structure in which :
 each node has no more than two child nodes.
 Each child must either be a leaf node or the root of another binary search tree.
 The left sub-tree contains only nodes with keys less than <= the parent node;
 the right sub-tree contains only nodes with keys greater than > the parent node.

 */
public class CCI4_3ArrayToBST {
    public BiTreeNode<Integer> ToBST(int [] arr) {
        return arrayTBS(arr, 0, arr.length-1);
    }

    public BiTreeNode<Integer> arrayTBS(int []arr, int low, int high) {
        if(low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        return new BiTreeNode<Integer>(arr[mid], arrayTBS(arr, low, mid-1), arrayTBS(arr, mid + 1, high));
    }
}
