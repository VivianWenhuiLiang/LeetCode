package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class CCI3_5MyQueueTest {
    private CCI3_5MyQueue solution = new CCI3_5MyQueue();


    @Test
    public void test() {
        solution.offer(1);
        solution.offer(2);
        solution.offer(3);
        solution.offer(4);
        solution.offer(5);
     Assert.assertEquals(false, solution.isEmpty());
     Assert.assertEquals(1,solution.poll());
     Assert.assertEquals(2,solution.peek());
     Assert.assertEquals(4,solution.size());
    }
}