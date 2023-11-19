package com.telran.org.lessonfourteen;

public class Util {
    public static void printGraph(Graph graph) {
        int source = 0;
        int size = graph.getAdjacencyList().size();

        if (source < size) {
            do {
                for (int dest : graph.getAdjacencyList().get(source)) {
                    System.out.print("[" + source + " -> " + dest + "]");
                }
                System.out.println();
                source++;

            } while (source < size);
        }
    }
}
