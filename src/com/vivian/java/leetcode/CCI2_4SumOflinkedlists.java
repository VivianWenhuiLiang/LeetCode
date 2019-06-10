package com.vivian.java.leetcode;
/* You have two numbers represented by a linkedlist,where each node contains a single digit,
   the digit s are stored in reverse order, such that the 1'S digit is at the head of the list.

   write a faction that adds the two numbers and returns the sum as the linkedlist.


   claritification: the 1's digit is at the head of linkedlint(the head)
                    does the result represent as integer or as linkedlist(linkedlist)
   approach: if node1==null&&node2==null,then stop the loop
             need two variables,sum ,carry
             while looping, each round,sum need to reset to zero
                                       if each addup >10,then carry=1
   complexcity: runtime complexcity o(n),since each node in both linkedlist visited once at the same time
                memory complexcity 0(n),each addup ,need to new a node


*/
public class CCI2_4SumOflinkedlists {
    public Node<Integer> sumOfLikedlists(Node<Integer> no1, Node<Integer> no2) {
        int carry = 0;
        Node result = null;
        Node tail = null;
        while(no1 != null || no2 != null) {
            int sum = 0;
            sum += carry;
            if(no1 != null) {
                sum = sum + no1.getData();
                no1 = no1.getNext();
            }
            if(no2 != null) {
                sum = sum + no2.getData();
                no2 = no2.getNext();
            }
            if(sum > 9) {
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            Node node = new Node<Integer>(sum, null);
            if(tail == null) {//the head of the linkedlist3
                result = node;
            } else {
                tail.setNext(node);
            }
            tail = node;
        }
        if(carry != 0) {
            tail.setNext(new Node<Integer>(1, null));
        }
        return result;
    }
}


