import java.util.LinkedList;

public class LL_01 {

    private Node Head;
    private Node Tail;

    private int Size;

    public LL_01() {
        this.Size = 0;
    }

    private class Node {
        private int Data;
        private Node Next;

        public Node(int Value) {
            this.Data = Value;
        }

        public Node(int Value, Node Next) {
            this.Data = Value;
            this.Next = Next;
        }
    }
}