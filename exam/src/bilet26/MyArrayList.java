package bilet26;

import java.util.Scanner;

public class MyArrayList<G> {
    private int size = 0;
    private class Node {
        public G data = null;
        public Node next = null;
        public Node() {

        }
        public Node(G data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node startArray = new Node();
    private Node endArray = startArray;

    public void add(G data) {
        if(size == 0) {
            startArray.data = data;

        }
        else {
            endArray.next = new Node(data, null);
            endArray = endArray.next;
        }
        size++;
    }

    public G get(int index) {
        int counter = 0;
        Node currentNode = startArray;
        if (index >= size) {
            return null;
        }
        else {
            while(counter != index) {
                currentNode = currentNode.next;
                counter++;
            }
            return currentNode.data;
        }

    }
    public void remove(int index) {
        if (index >= size) {
            return;
        }
        if(index == 0) {
            startArray = startArray.next;
        }

        else {
            int counter = 1;
            Node previosNode = startArray;
            Node currentNode = startArray.next;
            while(counter != index) {
                previosNode = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
            previosNode.next = currentNode.next;
        }
    }
    public void print() {
        Node currentNode = startArray;
        do {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }while(currentNode != null);
    }

}