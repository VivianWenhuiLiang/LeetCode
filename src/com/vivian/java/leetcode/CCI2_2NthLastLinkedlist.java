package com.vivian.java.leetcode;
import java.util.NoSuchElementException;
/* implement an algorithm to find the N-th to last element of a singly linkedlist

approach: nodes in the linkedlist must more then N,otherwise throw exception(N_th element doesn't exist)
          use tail to iterator first,while tail moves to N-th distant(count>=N)
          pointer N-th start move from head


complexcity: runtime complexity O(N),each node visited twice at the most ,memory complexity O(1)
*/
public class CCI2_2NthLastLinkedlist {
    public static class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public <T> T nthLastLinkedlist(Node<T> head, int n) {
        Node nth = head;
        Node tail = head;
        int count = 0;
        while(tail != null) {
            if(count >= n) {
                nth = nth.next;
            }
            tail = tail.next;
            count++;
        }
        if(count < n) {
            throw new NoSuchElementException();
        }
        return (T)nth.data;
    }
}