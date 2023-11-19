package com.telran.org.lessonfourteen;

import java.util.ArrayList;
import java.util.List;

public class TestGraph {
    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0,1));
        edges.add(new Edge(1,2));
        edges.add(new Edge(2,0));
        edges.add(new Edge(2,1));
        edges.add(new Edge(3,2));


        Graph graph = new Graph(edges);
        Util.printGraph(graph);
    }
}
