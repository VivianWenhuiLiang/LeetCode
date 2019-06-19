package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class CCI4_2HasRouteTest {
    CCI4_2HasRoute solution = new CCI4_2HasRoute();
    GraphNode<Integer> node1=new GraphNode<>(1);
    GraphNode<Integer> node2=new GraphNode<>(2);
    GraphNode<Integer> node3=new GraphNode<>(3);
    GraphNode<Integer> node4=new GraphNode<>(4);
    GraphNode<Integer> node5=new GraphNode<>(5);
    GraphNode<Integer> node6=new GraphNode<>(1);

    @Test
    public void test() {
        node1.getNeighbors().add(node2);//node1.getNeighbors() return empty arraylist
        node2.getNeighbors().add(node3);
        node2.getNeighbors().add(node4);
        node4.getNeighbors().add(node6);
        node5.getNeighbors().add(node4);
        node5.getNeighbors().add(node3);

        Assert.assertFalse(solution.hasRoute(node1,node5));
        Assert.assertTrue(solution.hasRoute(node1,node3));
        Assert.assertFalse(solution.hasRoute(node4,node1));

    }
}
