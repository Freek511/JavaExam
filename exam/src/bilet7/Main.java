package bilet7;

public class Main {
    public static void main(String[] args) {
        int[] arrayList1 = {1,3,5,7};
        int[] arrayList2 = new int[]{1,2,3,4,5};
        LinkedIntList linkedIntList1 = new LinkedIntList();
        LinkedIntList linkedIntList2 = new LinkedIntList();
        for (int num: arrayList1 ) {
            linkedIntList1.addNode(num);
        }
        for (int num: arrayList2 ) {
            linkedIntList2.addNode(num);
        }
        linkedIntList1.printList();
        linkedIntList2.printList();
        linkedIntList2.removeAll(linkedIntList1);
        linkedIntList1.printList();
        linkedIntList2.printList();

    }


}