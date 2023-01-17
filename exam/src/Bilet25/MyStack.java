package Bilet25;

public class MyStack<G> {
    private class NodeOfStack {
        public G data;
        public NodeOfStack next;

        public NodeOfStack(G data, NodeOfStack next){
            this.data = data;
            this.next = next;
        }
    }
    NodeOfStack mainPointer = null;

    public void push(G data) {
        mainPointer = new NodeOfStack(data, mainPointer);
    }
    public G peek() {
        return mainPointer.data;
    }
    public G pop() {
        G d = mainPointer.data;
        mainPointer = mainPointer.next;
        return d;
    }
    public boolean isEmpty() {
        return mainPointer == null;
    }
}
