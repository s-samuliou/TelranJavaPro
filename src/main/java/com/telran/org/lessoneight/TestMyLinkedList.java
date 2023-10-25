package com.telran.org.lessoneight;

import javax.swing.plaf.ViewportUI;

public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        packOperationsTwo(list);
        packOperationOne(list);
    }

    private static void packOperationsTwo(MyLinkedList list) {
        list.pushToTail(18);
    }

    private static void packOperationOne(MyLinkedList list) {
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(8);

        //8->3->4->2
        list.print();
        list.pushToTail(15);
        list.print();
    }
}
