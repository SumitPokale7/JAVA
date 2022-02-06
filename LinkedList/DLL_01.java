public class DLL_01 {

    Node Head;

    public void InsertFirst(int data) {
        Node node = new Node(data);
        node.Next = Head;
        node.Prev = null;
        if (Head != null) {
            Head.Prev = node;
        }
        Head = node;
    }

    public void InsertLast(int data) {
        Node node = new Node(data);
        Node last = Head;

        node.Next = null;

        if (Head == null) {
            node.Prev = null;
            Head = node;
            return;
        }

        while (last.Next != null) {
            last = last.Next;
        }

        last.Next = node;
        node.Prev = last;
    }

    public void insert(int After, int data) {
        Node p = Find(After);
        if (p == null) {
            System.out.println("Does not Exist");
            return;
        }

        Node node = new Node(data);
        node.Next = p.Next;
        p.Next = node;
        node.Prev = p;
        if (node.Next != null) {
            node.Next.Prev = node;
        }

    }

    public Node Find(int Value) {
        Node node = Head;
        while (node != null) {
            if (node.data == Value) {
                return node;
            }
            node = node.Next;
        }
        return null;
    }

    public void Display() {
        Node temp = Head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            last = temp;
            temp = temp.Next;
        }
        System.out.println("END");

        System.out.println("Printing in Reverse");
        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.Prev;
        }
        System.out.println("START");
    }

    private class Node {
        int data;
        Node Next;
        Node Prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            Next = next;
            Prev = prev;
        }
    }
}
