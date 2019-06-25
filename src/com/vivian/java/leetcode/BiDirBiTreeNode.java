package com.vivian.java.leetcode;

public class BiDirBiTreeNode<T> {
    private T data;
    private BiDirBiTreeNode<T> parent;
    private BiDirBiTreeNode<T> left;
    private BiDirBiTreeNode<T> right;

    public BiDirBiTreeNode(T data, BiDirBiTreeNode<T>parent, BiDirBiTreeNode<T> left, BiDirBiTreeNode<T> right) {
        this.data = data;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public BiDirBiTreeNode<T> getParent() {
        return this.parent;
    }

    public void setParent(BiDirBiTreeNode<T> parent){
        this.parent=parent;
    }

    public void setData(T item) {
        data = item;
    }

    public BiDirBiTreeNode<T> getLeft() {
        return left;
    }

    public BiDirBiTreeNode<T> getRight() {
        return right;
    }

}