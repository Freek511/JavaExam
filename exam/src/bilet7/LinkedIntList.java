package bilet7;

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
    public void removeAll(LinkedIntList anotherList) {
        ListNode previosCurrentNode = null;
        ListNode currentPointer = front;
        ListNode anotherPointer = anotherList.front;
        while (currentPointer.data != Integer.MAX_VALUE && anotherPointer.data != Integer.MAX_VALUE) {
            if(currentPointer.data < anotherPointer.data) {
                previosCurrentNode = currentPointer;
                currentPointer = currentPointer.next;

            }
            else if(currentPointer.data == anotherPointer.data) {
                if(currentPointer == front) {
                    front = currentPointer.next;
                    currentPointer = front;
                }
                else{
                    previosCurrentNode.next = currentPointer.next;
                    currentPointer = currentPointer.next;
                }
                anotherPointer = anotherPointer.next;


            }
            else {
                anotherPointer = anotherPointer.next;
            }
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
