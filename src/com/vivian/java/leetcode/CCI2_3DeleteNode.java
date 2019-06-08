package com.vivian.java.leetcode;
/* Implement an algorithm to delete specific node in a single linkedlist,
             given only access to that node
   Example: the node 'c' from the linkedlist a->b->c->d->e
   Result:  nothing is returned,but the new linkedlist looks like a->b->d->e

   calrification: Given node must be not null
                  the linkedlist is the single direction?(yes)
                  can't remove if the node is tha last of the linkedlist

   Approach: copy and paste the data from node.next.data to node.data,
             use node.next=node.next.next implement the faction

   complexity: Runtime complexity o(1),only visit the next one from the node
               memory complexity o(1)
               */
public class CCI2_3DeleteNode {
    public <T> boolean deleteNode(Node<T> node) {
        if(node == null || node.getNext() == null) { //not null,not the last
            return false;
        }
        node.setData(node.getNext().getData());
        node.setNext(node.getNext().getNext());
        return true;
    }
}