package com.vivian.java.leetcode;
import java.lang.IndexOutOfBoundsException;
import java.util.EmptyStackException;
import com.vivian.java.collections.ArrayList;
import com.vivian.java.collections.Stack;


/* Implement a data structure SetOfStacks which is composed several of stacks ,and could
   create a new stack once it reach its capacity
   SetOfStacks.push(), SetOfStacks.pop(),return its value as it would if there were just a single stack
Follow up:Implement a function popAt(index),which performs a pop operation on a specific sub-stack

*/
public class CCI3_3SetOfStacks extends Stack<Integer> {
    ArrayList<Stack> stacks = new ArrayList<>();
    int capacity;
    public CCI3_3SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    public int push(int item) {
        if(stacks.isEmpty() || stacks.get(stacks.size() - 1).size() == capacity) {
            stacks.add(new Stack<Integer>());
        }
        stacks.get(stacks.size() - 1).push(item);
        return item;
    }

    @SuppressWarnings("unchecked")
    public Integer pop() {
        if(stacks.isEmpty()) {
            throw new EmptyStackException();
        }
        int holder = (int)stacks.get(stacks.size() - 1).pop();
        if(stacks.get(stacks.size() - 1).isEmpty()) {
            stacks.remove(stacks.size() - 1);//if not remove,still could pop,but nothing comes out
            //which is not behave like stack
        }
        return holder;
    }


    public int size() {
        return stacks.size();
    }

    @SuppressWarnings("unchecked")
    public int popAt(int index) {
        if(index < 0 || index >= stacks.size()) {
            throw new IndexOutOfBoundsException();
        }
        int holder = (int)stacks.get(index).pop();//return value
        Stack<Integer>helper = new Stack<Integer>();//new empty stack
        for(int i = index + 1; i < stacks.size(); i++) {//current stack popOut to new stack upside down the order
            Stack<Integer>taget = stacks.get(i);
            for(int j = 0; j < taget.size(); j++) {
                helper.push(taget.pop());
            }
            stacks.get(i - 1).push(helper.pop()); //next bottom to current top
            while(!helper.isEmpty()) {
                stacks.get(i).push(helper.pop());//put back elements to current
            }
            if(stacks.get(i).isEmpty()) {
                stacks.remove(i);
            }
        }
        return holder;
    }
}
