package com.vivian.java.leetcode;
import com.vivian.java.collections.HashSet;
import com.vivian.java.collections.Set;
/* 4.2 Given directed graph,design an algorithm to find out
there is a route between two nodes
Approach: from given node to recursive the graph
        use hashSet to maintain the element ,
        if it contains the root,it doesn't have a route
        it root.equals(friend),find the route

complexity: runtime complexity o(numbers of sides + numbers of nodes)

*/
public class CCI4_2HasRoute {
    public boolean hasRoute(GraphNode<Integer> root, GraphNode<Integer> friend) {
        Set<GraphNode<Integer>> set = new HashSet<>();
        return DFS(root, friend, set);
    }

    public boolean DFS(GraphNode<Integer> root, GraphNode<Integer> friend, Set<GraphNode<Integer>> set) {
        if(root == null || set.contains(root)) {
            return false;
        }
        set.add(root);
        if(root == friend) {
            return true;
        }
        for(int i = 0; i < root.getNeighbors().size(); i++) {
            if(DFS(root.getNeighbors().get(i), friend, set)) {
                return true;
            }
        }
        return false;
    }

}
