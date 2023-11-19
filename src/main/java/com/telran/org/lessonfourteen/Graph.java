package com.telran.org.lessonfourteen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
    private List<List<Integer>> adjacencyList = new ArrayList<>();

    public Graph(List<Edge> edges) {
        int vertex = 0;

        for (Edge edge : edges) {
            vertex = Math.max(vertex, Math.max(edge.getSource(), edge.getDestination()));
        }

        for (int i = 0; i <= vertex; i++) {
            this.adjacencyList.add(i, new LinkedList<>());
        }

        for (Edge current : edges) {
            List<Integer> integers = this.adjacencyList.get(current.getSource());
            integers.add(current.getDestination());
        }
    }

    public List<List<Integer>> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<List<Integer>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }
}
