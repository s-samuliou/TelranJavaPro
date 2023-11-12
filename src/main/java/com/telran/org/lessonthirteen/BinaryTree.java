package com.telran.org.lessonthirteen;

import java.util.Stack;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int key, String value) {
        Node newNode = new Node(key, value);

        if (root == null) { // if tree doesn't exist
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (true) {
            parent = current;

            if (key == current.getKey()) {
                return;
            }

            if (key < current.getKey()) { // go left
                current = current.getLeft();

                if (current == null) {
                    parent.setLeft(newNode);
                    return;
                }
            } else { //go right
                current = current.getRight();

                if (current == null) {
                    parent.setRight(newNode);
                    return;
                }
            }
        }
    }

    public Node find(int key) {
        if (root == null) {
            return null;
        }

        Node current = root;

        if (key == current.getKey()) {
            return current;
        }

        while (true) {
            if (key < current.getKey()) { // go left
                current = current.getLeft();

                if (current.getKey() == key) {
                    return current;
                }
                
            } else { //go right
                current = current.getRight();

                if (current.getKey() == key) {
                    return current;
                }
            }
        }
    }

    public void print() {// метод для вывода дерева в консоль
        Stack globalStack = new Stack(); // общий стек для значений дерева

        globalStack.push(root);
        int gaps = 32; // начальное значение расстояния между элементами
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);// черта для указания начала нового дерева
        while (isRowEmpty == false) {
            Stack localStack = new Stack(); // локальный стек для задания потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) { // покуда в общем стеке есть элементы
                Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.getValue()); // выводим его значение в консоли
                    localStack.push(temp.getLeft()); // соохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.getRight());
                    if (temp.getLeft() != null ||
                            temp.getRight() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("__");// - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
        }
        System.out.println(separator);// подводим черту
    }
}
