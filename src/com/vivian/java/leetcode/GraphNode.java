package com.vivian.java.leetcode;
import com.vivian.java.collections.ArrayList;

public class GraphNode<T> {
    private T data;
    private ArrayList<GraphNode<T>> neighbors = new ArrayList<>();

    public GraphNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ArrayList<GraphNode<T>> getNeighbors() {
        return neighbors;
    }
}