package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class CCI2_5FindLoopStartTest {
    CCI_5FindLoopStart solution = new CCI_5FindLoopStart();
    @Test
    public void test() {
        Node<Character> e = new Node<Character>('e', null);
        Node<Character> circu = new Node<Character>('c', new Node<Character>('d', e));
        e.setNext(circu);

        Node<Character> node1 = new Node<Character>('a', new Node<Character>('b', circu));

        Assert.assertTrue(circu == solution.findLoopStart(node1));
    }
}