package Bilet10;

public class IntTree {

    public class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }
    int size = 0;
    Node root;
    void addNode(int value) {
        if(size == 0) {
            root = new Node(value);
            return;
        }
        Node currentNode = root;
        Node previosNode = null;
        boolean isLeft = false;
        while(currentNode != null) {
            if(value < currentNode.value) {
                previosNode = currentNode;
                currentNode = currentNode.left;
                isLeft = true;
            }
            else {
                previosNode = currentNode;
                currentNode = currentNode.right;
                isLeft = false;
            }
        }
        currentNode = new Node(value);
        if(isLeft) previosNode.left = currentNode;
        else previosNode.right = currentNode;
        size++;
    }

    public boolean equals2(IntTree anotherTree) {
        //Optimization!!!
        if(this.size != anotherTree.size) return false;
        return equalsNodes(this.root, anotherTree.root);
    }
    public boolean equalsNodes(Node first, Node second) {
        if(first == null && second == null) {
            return true;
        }
        if(first != null && second != null) {
            return(
                    first.value == second.value
                    && equalsNodes(first.left, second.left)
                    && equalsNodes(first.right, second.right)
            );
        }
        return false;
    }
}
