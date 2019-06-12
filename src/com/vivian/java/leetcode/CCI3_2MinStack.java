package com.vivian.java.leetcode;
import java.util.EmptyStackException;
import com.vivian.java.collections.Stack;
/*
How would you design a stack which, in addition to push and pop,
also has a function min which returns the minimun element?
Push,pop and min should all operate in O(1) time

Approach: use additional minStack to track min element,while adding new element need to be compare
          with the top element of the minStack,added in if element <=top.element
complexity: runtime complexity o(1),return element in O(1)time
            memory complexity O(n)

*/
public class CCI3_2MinStack extends Stack<Integer> {
    private Stack<Integer> minStack;

    public CCI3_2MinStack(){
        minStack=new Stack<Integer>();
    }

    public int push(int item) {
        if(minStack.isEmpty()||item <= getMin()) {
            minStack.push(item);
        }
        return super.push(item);
    }

    public Integer pop() {
        if(super.peek() == minStack.peek()) {
            minStack.pop();
        }
        return super.pop();
    }

    public int getMin() {
        if(minStack.isEmpty()){
            throw new EmptyStackException();
        }
        return minStack.peek();
    }
}