package com.vivian.java.leetcode;
import java.lang.Math;
/*
You are given a BiTree in which each node contains a value.
Write an algorithm to print all paths which sum to given value.
The path does not need to start or end at the root or a leaf.

Clarificaiton:
Approach:for each node, start from root and branch left and right,computing the sum thus on each path.
         when we find the sum ,we print the current path out.

complexity: runtime complexity,(in perfect BiTree)for each node we travsal
           n+(n-1)+(n-3)+...+n/2= nlogn (n items,logn is the layers of the tree
*/
public class CCI4_9FindPathsWithSum {
    public void findSum(BiTreeNode<Integer> root, int sum) {
        if(root == null) {
            return;
        }
        int depth = depth(root);
        int[]path = new int[depth];
        findSum(root, path, sum, 0);
        findSum(root.getLeft(), sum);
        findSum(root.getRight(), sum);
    }

    public void findSum(BiTreeNode<Integer> root, int[]path, int sum, int level) {
        if(root == null) {
            return;
        }
        path[level] = root.getData();
        int total = 0;
        for(int i = level; i >= 0; i--) {
            total = total + path[i];
            if(total == sum) {
                printPath(path, i, level);
            }
        }
        findSum(root.getLeft(), path, sum, level + 1);
        findSum(root.getRight(), path, sum, level + 1);
    }
    public int depth(BiTreeNode<Integer> root) {
        if(root == null) {
            return 0;
        }
        return Math.max(depth(root.getLeft()), depth(root.getRight())) + 1;
    }

    public void printPath(int [] path, int start, int end) {
        for(int i = start; i <= end; i++) {
            System.out.print(path[i]);
        }
        System.out.println();
    }
}
