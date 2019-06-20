package com.vivian.java.leetcode;
import com.vivian.java.collections.ArrayList;

public class TreeNode<T> {
    private T data;
    private ArrayList<TreeNode<T>> child = new ArrayList<>();

    public TreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ArrayList<TreeNode<T>> getChild() {
        return child;
    }
}