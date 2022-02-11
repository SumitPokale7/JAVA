
public class Bubble_Sort_List_10 {

    public static void main(String[] args) {
        Bubble_Sort_List_10 list = new Bubble_Sort_List_10();

        for (int i = 7; i > 0; i--) {
            list.InsertLast(i);
        }
        list.Display();
        list.BubbleSort();
        list.Display();
    }

    private Node Head;
    private Node Tail;

    private int Size;

    public Bubble_Sort_List_10() {
        this.Size = 0;
    }
    // Using Bubble Sort

    public void BubbleSort() {
        BubbleSort(Size - 1, 0);
    }

    private void BubbleSort(int Row, int Col) {
        if (Row == 0) {
            return;
        }

        if (Col < Row) {
            Node first = Get(Col);
            Node second = Get(Col + 1);

            if (first.Data > second.Data) {
                // Swap
                if (first == Head) {
                    Head = second;
                    first.Next = second.Next;
                    second.Next = first;
                } else if (second == Tail) {
                    Node Prev = Get(Col - 1);
                    Prev.Next = second;
                    Tail = first;
                    first.Next = null;
                    second.Next = Tail;
                } else {
                    Node Prev = Get(Col - 1);
                    Prev.Next = second;
                    first.Next = second.Next;
                    second.Next = first;
                }
            }
            BubbleSort(Row, Col + 1);
        } else {
            BubbleSort(Row - 1, 0);
        }
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