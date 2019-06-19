package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;
import com.vivian.java.collections.Stack;

public class CCI3_7AnimalQueueTest {
    private CCI3_7AnimalQueue solution = new CCI3_7AnimalQueue();
    CCI3_7AnimalQueue.Animal d1 = new CCI3_7AnimalQueue.Dog("d1"); //0
    CCI3_7AnimalQueue.Animal c1 = new CCI3_7AnimalQueue.Cat("c1"); //1
    CCI3_7AnimalQueue.Animal c2 = new CCI3_7AnimalQueue.Cat("c2"); //2
    CCI3_7AnimalQueue.Animal c3 = new CCI3_7AnimalQueue.Cat("c3"); //3
    CCI3_7AnimalQueue.Animal d2 = new CCI3_7AnimalQueue.Dog("d2"); //4

    @Test
    public void test() {
        solution.enqueue(d1);
        solution.enqueue(c1);
        solution.enqueue(d2);
        solution.enqueue(c3);
        solution.enqueue(d2);
        Assert.assertSame(d1, solution.dequeueAny());
        Assert.assertSame(d2, solution.dequeueDog());
        Assert.assertSame(c1, solution.dequeueCat());
    }
}