package com.vivian.java.leetcode;
import org.junit.Test;
import org.junit.Assert;


public class CCI2_2NthLastLinkedlistTest {
    private CCI2_2NthLastLinkedlist solution = new CCI2_2NthLastLinkedlist();

    @Test
    public void test() {
        CCI2_2NthLastLinkedlist.Node<Integer> linkedlist = new CCI2_2NthLastLinkedlist.Node<Integer>(
            1, new CCI2_2NthLastLinkedlist.Node<Integer>(
                2, new CCI2_2NthLastLinkedlist.Node<Integer>(
                    3, new CCI2_2NthLastLinkedlist.Node<Integer>(
                        4, new CCI2_2NthLastLinkedlist.Node<Integer>(
                            5, null)))));


        Assert.assertEquals(4, (long)solution.nthLastLinkedlist(linkedlist, 2));
    }
}