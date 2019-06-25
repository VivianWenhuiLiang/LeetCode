package com.vivian.java.leetcode;
import com.vivian.java.collections.List;

public class GraphNode<T> {
    private T data;
    private List<GraphNode<T>> neighbors = new List<>();

    public GraphNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<GraphNode<T>> getNeighbors() {
        return neighbors;
    }
}