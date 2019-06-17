package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class CCI2_3DeleteNodeTest {
    private CCI2_3DeleteNode solution = new CCI2_3DeleteNode();

    @Test
    public void test() {
        Node<Character> nodeE = new Node<Character>('e', null);
        Node<Character> nodeC = new Node<Character>(
            'c', new Node<Character>(
                'd', nodeE));
        Node<Character> actual = new Node<Character>(
            'a', new Node<Character>(
                'b', nodeC));

        Assert.assertTrue(Node.linkedListEquals(
                              Node.arrayToNode(new Character[] {'a', 'b', 'c', 'd', 'e'}), actual));

        // delete 'c'
        Assert.assertTrue(solution.deleteNode(nodeC));
        Assert.assertTrue(Node.linkedListEquals(
                              Node.arrayToNode(new Character[] {'a', 'b', 'd', 'e'}), actual));

        // verify deletion of head
        Assert.assertTrue(solution.deleteNode(actual));
        Assert.assertTrue(Node.linkedListEquals(
                              Node.arrayToNode(new Character[] {'b', 'd', 'e'}), actual));

        // verify deletion of tail
        Assert.assertFalse(solution.deleteNode(nodeE));
        Assert.assertTrue(Node.linkedListEquals(
                              Node.arrayToNode(new Character[] {'b', 'd', 'e'}), actual));
    }
}