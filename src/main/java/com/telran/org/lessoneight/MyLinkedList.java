package com.telran.org.lessoneight;

public class MyLinkedList {
    private Node head = null;

    public void add(int data) {
        Node node = new Node(data, null);

        if (this.head == null) {
            this.head = node;
            return;
        }

        node.setNext(this.head);
        this.head = node;
    }

    public void pushToTail(int data) {
        Node newNode = new Node(data, null);
        Node node = this.head;

        if (head == null) {
            head = newNode;
            return;
        }

        while (node.getNext() != null) {
            node = node.getNext();
        }

        node.setNext(newNode);
    }

    public void print() {
        Node node = this.head;

        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }

        System.out.println();
    }
}
