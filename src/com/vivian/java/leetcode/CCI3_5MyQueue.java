package com.vivian.java.leetcode;
import com.vivian.java.collections.Stack;
/*Implement a MyQueue class which implement a Queue using two Stacks

*/
public class CCI3_5MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public CCI3_5MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public int size() {
        return s1.size() + s2.size();
    }
    public int peek() {
        return s2.peek();
    }
    public int poll() {
        if(!s2.isEmpty()) {
            return s2.pop();
        }
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    public int offer(int item) { //add
        return s1.push(item);

    }
    public boolean isEmpty() {
        return size() == 0;
    }
}