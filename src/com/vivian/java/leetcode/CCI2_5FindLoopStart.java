package com.vivian.java.leetcode;
/* Given a circular linkedlist, implement an algorithm
  which returns node at the beginning of the loop
  Definition:
             circular linkedlist:A linkedlist in which a node's next pointer points to an
earlier node, so as to make a loop in the linkedlist
Example:
Input: A->B->C->D->E->C  (the same C as earlier)  
Output: C

Claritification: like pre_example,C is the start of a loop

Edge case: ensure the linkedlist not null and is circular

Approcah: use two pointers, for iterator step1 visit node one by one(1 times speed to move on)
          step2 use 2times speed of step1 to visit node,after n times of circular step1 and step2 would meet in one node

          use step1 point to the head,then step1 and step both use 1 times speed ,then they meet again,return the node they meet


math: support the len of head node to the start of beginning loop  is A;
      the len of loop (circular) is B;
      step1 and step1 first meet at a distance C (from the beginning loop to the meeting node)
     when they meet the count of two pointer moves step1= A+C;
                                                   step2=A+C+n*B ;
                                                   because step2 is 2 times peed of step1,so
                                                   2(A+C)=A+C+nB => A=(n-1)B+B-C 
                                                   =>A=B-C (this is why head to beginng diatance == meeting point to beginning)


complexity: runtime complexity O(n),worse case step1 visvited every element in the linkedlist,and step2 2n
            memory complexit O(1)
            */

public class CCI2_5FindLoopStart {
    public <E> Node<E> findLoopStart(Node<E> head) {
        if(head == null) {
            return null;
        }
        Node<E> step1 = head;
        Node<E> step2 = head;
        while(step2 != null&&step2.getNext() != null) {// ensure the linkedlist is circular
            step1 = step1.getNext();
            step2 = step2.getNext().getNext();
           
            if(step1.getData() == step2.getData()) {
                break;
            }
        }
        step1 = head;
        while(step1 != step2) {
            step1 = step1.getNext();
            step2 = step2.getNext();
        }
        return step1;

    }
}