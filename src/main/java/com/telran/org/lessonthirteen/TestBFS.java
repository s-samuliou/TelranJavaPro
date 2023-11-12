package com.telran.org.lessonthirteen;

import java.util.LinkedList;
import java.util.Queue;

public class TestBFS {

    public static void main(String[] args) {
        BinaryTree binaryTreeTwo = new BinaryTree();
        /*binaryTreeTwo.insert(3, "node 3");
        binaryTreeTwo.insert(2, "node 2");
        binaryTreeTwo.insert(1, "node 1");
        binaryTreeTwo.insert(4, "node 4");
        binaryTreeTwo.insert(5, "node 5");*/
        binaryTreeTwo.insert(10, "node 10");
        binaryTreeTwo.insert(9, "node 9");
        binaryTreeTwo.insert(7, "node 7");
        binaryTreeTwo.insert(8, "node 8");
        binaryTreeTwo.insert(13, "node 13");
        binaryTreeTwo.insert(11, "node 11");
        binaryTreeTwo.insert(14, "node 14");

        binaryTreeTwo.print();

        breadFirstSearch(binaryTreeTwo);
    }

    private static void breadFirstSearch(BinaryTree binaryTree) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(binaryTree.getRoot());

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println("Value = " + node.getValue());

            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }

            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }
}
