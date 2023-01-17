package Bilet9;


public class Main {
    public static void main(String[] args) {
        int[] arrayList1 = new int[]{14,8,14,12,1,14,11,8,8,10,4,9,1,2,5,2,4,12,12};
        LinkedIntList linkedIntList = new LinkedIntList();
        for (int num: arrayList1 ) {
            linkedIntList.addNode(num);
        }

        linkedIntList.printList();
        linkedIntList.removeDuplicates();
        linkedIntList.printList();
    }
}
