package bilet11;

import bilet7.ListNode;

public class LinkedIntList {
    private ListNode root;
    private class ListNode {
        public int data;
        public ListNode next = null;
    }

    public LinkedIntList(){
        this.root= null;
    }

    public void add(int data)
    {
       if(root == null){
           root = new ListNode();
           root.data = data;
       }
       else{
           ListNode curr = root;
           while(curr.next != null){
               curr=curr.next;
           }
           curr.next=new ListNode();
           curr.next.data =data;
       }
    }

    public void firstLast(){
        ListNode startElement = root;
        ListNode currElement = root;
        while (currElement.next!= null){
            currElement=currElement.next;
        }
        root=root.next;
        currElement.next=startElement;
        /*startElement.next.data=Integer.MAX_VALUE;*/
        startElement.next=null;
    }
    public void printList() {
        ListNode currentNode = root;
        System.out.println("");
        while(currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}
