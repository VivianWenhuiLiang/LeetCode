package com.vivian.java.leetcode;

public class Node<T> {
    private T data;
    private Node<T> next;
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public T getData() {
        return data;
    }
    public void setData(T data){
        this.data=data;
    }
    public void setNext(Node<T> next){
        this.next=next;
    }
    public Node<T> getNext() {
        return next;
    }

    public static <E> boolean linkedListEquals(Node<E> n1, Node<E> n2 ) {
        while(n1 != null && n2 != null) {
            if(!n1.getData().equals(n2.getData())) {
                return false;
            }
            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        return n1 == n2;
    }

    public static <E> Node<E> arrayToNode(E[] array) {
        Node<E> head = null;
        for (int i = array.length - 1; i >= 0; i--) {
            head = new Node<E>(array[i], head);
        }
        return head;
    }

    public static <E> void printLinkedList(Node<E> head) {
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