package com.vivian.java.leetcode;
import java.lang.IllegalArgumentException;
import java.util.EmptyStackException;
/*Describe how you could use a singlr array to implement three stacks


claritification: Dose the arry is immutable? certain size? (yes)

approach: Divide array into three equal parts [0, n/3);
                                              [n/3,2n/3);
                                              [2n/3, n);
          new size 3 array to store stacks,
          its elements repersent each stack last element located ,-1 means empty
          while add an element into a stack ,must given stack number
          use arr[stackNum*stackSize+stacks[stackNum]+1] to add elements
          also insertion,and deletion need stackNum

complexity: runtime complexity o(1),according arry feature,known index would return spcific element in O(1) running time
            memory complexityo(1)

*/

public class CCI3_1ArrayIntoThreeStacks {
    private int stackSize = 100;
    private int arr[] = new int [stackSize * 3]; //consist by three stacks
    private int stacks[] = {-1, -1, -1}; //three empty stacks



    public int push(int stackNum, int value) {
        if(stackNum < 0 || stackNum > 3) {
            throw new IllegalArgumentException("invaild stackNum,pick stackNum 0,1,2");
        }
        int index = stackNum * stackSize + stacks[stackNum] + 1;
        arr[index] = value;
        stacks[stackNum]++;
        return value;
    }

    public int pop(int stackNum) {
        if(stackNum < 0 || stackNum > 3) {
            throw new IllegalArgumentException("invaild stackNum,pick stackNum 0,1,2");
        }
        if(stacks[stackNum] == -1) {
            throw new EmptyStackException();
        }
        int index = stackNum * stackSize + stacks[stackNum];
        int hold = arr[index];
        stacks[stackNum]--;
        return hold;
    }

    public boolean isEmpty(int stackNum) {
        if(stackNum < 0 || stackNum > 3) {
            throw new IllegalArgumentException("invaild stackNum,pick stackNum 0,1,2");
        }
        return stacks[stackNum] == -1;
    }

    public int size(int stackNum) {
        if(stackNum < 0 || stackNum > 3) {
            throw new IllegalArgumentException("invaild stackNum,pick stackNum 0,1,2");
        }
        return stacks[stackNum] + 1;
    }

    public int peek(int stackNum) {
        if(stackNum < 0 || stackNum > 3) {
            throw new IllegalArgumentException("invaild stackNum,pick stackNum 0,1,2");
        }
        if(stacks[stackNum] == -1) {
            throw new EmptyStackException();
        }
        int index = stackNum * stackSize + stacks[stackNum];
        return arr[index];
    }
}