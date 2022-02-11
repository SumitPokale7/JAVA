
public class Reverse_LinkedList_11 {

    public static void main(String[] args) {
        Reverse_LinkedList_11 list = new Reverse_LinkedList_11();
        list.InsertLast(85);
        list.InsertLast(856);
        list.InsertLast(8);
        list.InsertLast(98);
        list.InsertLast(984);
        list.Display();
    }

    private Node Head;
    private Node Tail;

    private int Size;

    public Reverse_LinkedList_11() {
        this.Size = 0;
    }

    // Reverse Linked List
    // private void ReverseLL(Node node) {
    // if (node == Tail) {
    // Tail = Head;
    // return;
    // }

    // ReverseLL(node.Next);

    // Tail.Next = node;
    // Tail = node;
    // Tail.Next = null;
    // }

    // In-Place Reversal of Linked List
    // https://leetcode.com/problems/reverse-linked-list/
    // 206. Reverse Linked List
    public void Reverse() {
        if (Size < 2) {
            return;
        }
        Node Prev = null;
        Node Present = Head;
        Node Next = Present.Next;

        while (Present != null) {
            Present.Next = Prev;
            Prev = Present;
            Present = Next;

            if (Next != null) {
                Next = Next.Next;
            }
        }
        Head = Prev;
    }

    // Insert Using Recursion
    public void InsertRecursion(int Data, int index) {
        Head = InsertRecursion(Data, index, Head);
    }

    private Node InsertRecursion(int Data, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(Data, node);
            Size++;
            return temp;
        }
        node.Next = InsertRecursion(Data, index--, node.Next);
        return node;
    }

    public void InsertFirst(int Data) {
        Node node = new Node(Data);
        node.Next = Head;
        Head = node;

        if (Tail == null) {
            Tail = Head;
        }
        Size++;
    }

    public void InsertLast(int Data) {

        if (Tail == null) {
            InsertFirst(Data);
            return;
        }

        Node node = new Node(Data);
        Tail.Next = node;
        Tail = node;
        Size++;
    }

    public void Insert(int data, int index) {
        if (index == 0) {
            InsertFirst(data);
            return;
        }
        if (index == Size) {
            InsertLast(data);
            return;
        }
        Node temp = Head;
        for (int i = 1; i < index; i++) {
            temp = temp.Next;
        }

        Node node = new Node(data, temp.Next);
        temp.Next = node;

        Size++;
    }

    public int DeleteFirst() {
        int Data = Head.Data;
        Head = Head.Next;
        if (Head == null) {
            Tail = null;
        }
        Size--;
        return Data;
    }

    public int DeleteLast() {
        if (Size <= 1) {
            return DeleteFirst();
        }
        Node SecondLast = Get(Size - 2);
        int data = Tail.Data;
        Tail = SecondLast;
        Tail.Next = null;
        return data;
    }

    public int Delete(int index) {
        if (index == 0) {
            return DeleteFirst();
        }
        if (index == Size - 1) {
            return DeleteLast();
        }
        Node Prev = Get(index - 1);
        int data = Prev.Next.Data;

        Prev.Next = Prev.Next.Next;

        return data;
    }

    public Node Find(int data) {
        Node node = Head;
        while (node != null) {
            if (node.Data == data) {
                return node;
            }
            node = node.Next;
        }
        return null;
    }

    public Node Get(int index) {
        Node node = Head;
        for (int i = 0; i < index; i++) {
            node = node.Next;
        }
        return node;
    }

    public void Display() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.Data + " -> ");
            temp = temp.Next;
        }
        System.out.println("End");
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