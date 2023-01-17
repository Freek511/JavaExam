package Bilet9;

import Bilet7.ListNode;

public class LinkedIntList {
    private ListNode front;
    public LinkedIntList() {
        front = new ListNode();
    }
    public void addNode(int number) {
        boolean flag = false;
        ListNode currentNode = front;
        do {
            if (currentNode.data == Integer.MAX_VALUE) {
                currentNode.data = number;
                flag = true;
                currentNode.next = new ListNode();
            }
            else {
                currentNode = currentNode.next;
            }

        }while(!flag);
    }
    public void removeDuplicates() {
        ListNode currentNode = front;
        ListNode previosOfChecked = front;
        ListNode checkedNode = front.next;

        while(currentNode.data != Integer.MAX_VALUE) {
            while(checkedNode.data != Integer.MAX_VALUE) {
                if(checkedNode.data == currentNode.data) {
                    previosOfChecked.next = checkedNode.next;
                }
                else {
                    previosOfChecked = checkedNode;
                }
                checkedNode = checkedNode.next;
            }
            currentNode = currentNode.next;
            previosOfChecked = currentNode;
            checkedNode = currentNode.next;
        }
    }
    public void printList() {
        ListNode currentNode = front;
        System.out.println("");
        while(currentNode.data != Integer.MAX_VALUE) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}
