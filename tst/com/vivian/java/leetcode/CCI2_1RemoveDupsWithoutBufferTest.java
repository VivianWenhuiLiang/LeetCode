package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class CCI2_1RemoveDupsWithoutBufferTest {
    private CCI2_1RemoveDupsWithoutBuffer solution = new CCI2_1RemoveDupsWithoutBuffer();
    public <T> boolean equals(CCI2_1RemoveDupsWithoutBuffer.Node<T> n1, CCI2_1RemoveDupsWithoutBuffer.Node<T> n2 ) {
        while(n1 != null && n2 != null) {
            if(!n1.getData().equals(n2.getData())) {
                return false;
            }
            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        return n1 == n2;
    }

    @Test
    public void test() {
        CCI2_1RemoveDupsWithoutBuffer.Node<Integer> linkedList1 = arrayToNode(new Integer[] {1, 4, 1, 2, 3, 2, 5, 3});
        CCI2_1RemoveDupsWithoutBuffer.Node<Integer> expected = arrayToNode(new Integer[] {1, 4, 2, 3, 5});
        CCI2_1RemoveDupsWithoutBuffer.Node<Integer> actual = solution.removeDupsNoBuffer(linkedList1);
        printLinkedList(expected);
        printLinkedList(actual);


        Assert.assertTrue(equals(expected, actual));
    }

    public static <T> CCI2_1RemoveDupsWithoutBuffer.Node<T> arrayToNode(T[] array) {
        CCI2_1RemoveDupsWithoutBuffer.Node<T> head = null;
        for (int i = array.length - 1; i >= 0; i--) {
            head = new CCI2_1RemoveDupsWithoutBuffer.Node<T>(array[i], head);
        }
        return head;
    }

    public static <T> void printLinkedList(CCI2_1RemoveDupsWithoutBuffer.Node<T> head) {
        if (head == null) {
            System.out.println("head == null");
        }
        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
        System.out.println();
    }
}