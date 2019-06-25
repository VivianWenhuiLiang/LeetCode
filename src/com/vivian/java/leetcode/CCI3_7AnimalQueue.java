package com.vivian.java.leetcode;

import com.vivian.java.collections.LinkedList;
/* An anomal shelter operates on "FIFO" basis
People most adopt either the "oldest"(based on arrival time)
or they can select whether they would prefer a dog or a cat(will receive the oldest of that type )


create data structures to maintain this system and implement operations such as
enqueue, dequeueAny, dequeueDog and dequeueCat.

You may use the built-in linkedlist data structure

approach: create a variable to record animal's arrival number

*/
public class CCI3_7AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal a) {
        order++;
        a.setOrder(order);
        if(a instanceof Dog) {
            dogs.addLast((Dog)a);//a is super type need to forced type conversion
        } else if(a instanceof Cat) {
            cats.addLast((Cat)a);
        }
    }

    public Animal dequeueAny() {
        if(dogs.isEmpty()) {
            return dequeueCat();
        }
        if(cats.isEmpty()) {
            return dequeueDog();
        }
        if(cats.getFirst().getOrder() < dogs.getFirst().getOrder()) {
            return dequeueCat();//number 0 is the oldest less number early arrived
        } else {
            return dequeueDog();
        }
    }

    public Dog dequeueDog() {
        return dogs.poll();//removeFirst
    }

    public Cat dequeueCat() {
        return cats.poll();
    }

    public static class Animal {
        private int order;
        protected String name;
        public Animal(String n) {
            this.name = n;
        }
        public int getOrder() {
            return order;
        }
        public void setOrder(int Order) {
            this.order = order;
        }
    }

    public static class Cat extends Animal {
        public Cat(String n) {
            super(n);
        }
    }

    public static class Dog extends Animal {
        public Dog(String n) {
            super(n);
        }
    }

}

