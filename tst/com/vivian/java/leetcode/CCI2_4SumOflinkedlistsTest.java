package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class CCI2_4SumOflinkedlistsTest {
    CCI2_4SumOflinkedlists solution = new CCI2_4SumOflinkedlists();
    @Test
    public void test() {
        Node<Integer> node1 = Node.arrayToNode(new Integer[] {4, 5, 6});
        Node<Integer> node2 = Node.arrayToNode(new Integer[] {4, 5, 6});
        Node<Integer> sum = Node.arrayToNode(new Integer[] {8, 0, 3, 1});

        Node.linkedListEquals(sum, solution.sumOfLikedlists(node1, node2));
    }
}