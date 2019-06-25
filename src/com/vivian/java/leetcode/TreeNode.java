package com.vivian.java.leetcode;
import com.vivian.java.collections.List;

public class TreeNode<T> {
    private T data;
    private List<TreeNode<T>> child = new List<>();

    public TreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<TreeNode<T>> getChild() {
        return child;
    }
}