package Bilet10;

public class Main {
    public static void main(String[] args) {
        IntTree tree1 = new IntTree();
        IntTree tree2 = new IntTree();

        tree1.addNode(1);
        tree1.addNode(0);
        tree1.addNode(3);
        tree1.addNode(2);
        tree1.addNode(5);

        tree2.addNode(1);
        tree2.addNode(0);
        tree2.addNode(3);
        tree2.addNode(2);
        tree2.addNode(5);

        System.out.println(tree1.equals2(tree2));



    }
}
