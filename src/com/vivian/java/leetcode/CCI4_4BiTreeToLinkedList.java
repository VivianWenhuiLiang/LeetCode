package com.vivian.java.leetcode;
import com.vivian.java.collections.LinkedList;
import com.vivian.java.collections.ArrayList;
import com.vivian.java.collections.List;
import com.vivian.java.collections.Queue;
/* Given a Binary Tree, design an alogrithm which create a linkedlist of all nodes at each depth
(For excemple: if you have a tree with depth D, you'll have D linkedLists)


approach: use BFS(broad first search)level by level trvesal

complexity:o(n) each node visvied once
          memory complexity o(n)
*/
public class CCI4_4BiTreeToLinkedList {
    public List<LinkedList<TreeNode<Integer>>> toLinkedList(TreeNode<Integer> root) {
        if(root == null) {
            return null;
        }
        List<LinkedList<TreeNode<Integer>>> list = new ArrayList<>();
        Queue<TreeNode<Integer>> current = new LinkedList<>();
        Queue<TreeNode<Integer>> next = new LinkedList<>();
        current.offer(root);
        list.add(new LinkedList<TreeNode<Integer>>(current));
        while(!current.isEmpty() || !next.isEmpty()) {
            if(current.isEmpty()) {
                current = next;
                list.add(new LinkedList<TreeNode<Integer>>(current));
                next = new LinkedList<TreeNode<Integer>>();
                continue;
            }
            TreeNode<Integer> hold = current.poll();
            for(int i = 0; i < hold.getChild().size(); i++) {
                next.offer(hold.getChild().get(i));
            }
        }
        return list;
    }
}
