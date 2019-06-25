package com.vivian.java.leetcode;
import com.vivian.java.collections.LinkedList;
import com.vivian.java.collections.ArrayList;
import com.vivian.java.collections.List;
import org.junit.Assert;
import org.junit.Test;

public class CCI4_4BiTreeToLinkedListTest {
    CCI4_4BiTreeToLinkedList solution = new CCI4_4BiTreeToLinkedList();
    TreeNode<Integer> node1 = new TreeNode<>(1);
    TreeNode<Integer> node2 = new TreeNode<>(2);
    TreeNode<Integer> node3 = new TreeNode<>(3);
    TreeNode<Integer> node4 = new TreeNode<>(4);
    TreeNode<Integer> node5 = new TreeNode<>(5);
    TreeNode<Integer> node6 = new TreeNode<>(6);
    TreeNode<Integer> node7 = new TreeNode<>(7);
    TreeNode<Integer> node8 = new TreeNode<>(8);
    TreeNode<Integer> node9 = new TreeNode<>(9);

    @Test
    public void test() {
        node1.getChild().add(node2);//node1.getChild() return empty arraylist
        node1.getChild().add(node3);
        node1.getChild().add(node4);

        node2.getChild().add(node5);
        node2.getChild().add(node6);

        node3.getChild().add(node7);
        node4.getChild().add(node8);
        node4.getChild().add(node9);
        List<LinkedList<TreeNode<Integer>>> list=new ArrayList<>();
        LinkedList<TreeNode<Integer>> ll0 = new LinkedList<>();
        ll0.add(node1);
        LinkedList<TreeNode<Integer>> ll1 = new LinkedList<>();
        ll1.add(node2);
        ll1.add(node3);
        ll1.add(node4);
        LinkedList<TreeNode<Integer>> ll2 = new LinkedList<>();
        ll2.add(node5);
        ll2.add(node6);
        ll2.add(node7);
        ll2.add(node8);
        ll2.add(node9);

        list.add(ll0);
        list.add(ll1);
        list.add(ll2);

        List<LinkedList<TreeNode<Integer>>> result = solution.toLinkedList(node1);
        for(int i = 0; i < list.size(); i++) {
            Assert.assertTrue(samelinkedList(result.get(i), list.get(i)));
        }
    }

    public boolean linkedListEquals(LinkedList<TreeNode<Integer>> head1, LinkedList<TreeNode<Integer>>head2) {
        if(head2.size() != head1.size()) {
            return false;
        }
        while(!head1.isEmpty() && !head2.isEmpty()) {
            if(!head2.removeFirst().equals(head1.removeFirst()) ){
                return false;
            }
        }
        return true;
    }
}
