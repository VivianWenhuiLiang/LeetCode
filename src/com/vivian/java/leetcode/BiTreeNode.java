package com.vivian.java.leetcode;

public class BiTreeNode<T> {
    private T data;
    private BiTreeNode<T> left;
    private BiTreeNode<T> right;

    public BiTreeNode(T data, BiTreeNode<T> left, BiTreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T item) {
        data = item;
    }
    public BiTreeNode<T> getLeft() {
        return left;
    }
    public BiTreeNode<T> getRight() {
        return right;
    }

}