package com.vivian.java.leetcode;
import java.lang.NullPointerException;
/* write code to remove duplicates from an unsorted linkedList
(how would you solve this problem if a temporary buffer is not allowed?)

clarification: without buffer
               Node style linkedlist

approach: use three pointer: cur(iterator for grand loop; the end edge of inner loop)
                             pre(maker the current non_duplicate element)
                             run(inner loop, find the duplicate)

complexity: runtime complexity o(n*n), memory complexity o(1) only for the variables
*/

public class CCI2_1RemoveDupsWithoutBuffer {
    public static class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
        public T getData() {
            return data;
        }
        public Node<T> getNext() {
            return next;
        }
    }

    public <T> Node<T> removeDupsNoBuffer(Node<T> head) {
        if(head == null) {
            throw new NullPointerException();
        }
        Node pre = head;
        Node cur = head.next;
        while(cur != null) {
            Node run = head;
            while(run != cur) { //node [0]~[cur-1] compare with [cur]
                if(run.data == cur.data) {
                    pre.next = cur.next;
                    break;
                }
                run = run.next;
            }
            if(run == cur) { //no duplicate found
                pre = cur;
            }
            cur = cur.next; //add one more to compare
        }
        return head;
    }
}