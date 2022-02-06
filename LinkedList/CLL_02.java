import javax.swing.text.AbstractDocument.BranchElement;
import javax.xml.validation.Validator;

public class CLL_02 {

    private Node Head;
    private Node Tail;

    public CLL_02() {
        this.Head = null;
        this.Tail = null;
    }

    public void Insert(int data) {
        Node node = new Node(data);
        if (Head == null) {
            Head = node;
            Tail = node;
            return;
        }
        Tail.Next = node;
        node.Next = Head;
        Tail = node;
    }

    public void Delete(int data) {
        Node node = Head;
        if (node == null) {
            return;
        }
        if (node.data == data) {
            Head = Head.Next;
            Tail.Next = Head;
            return;
        }

        do {
            Node n = node.Next;
            if (n.data == data) {
                node.Next = n.Next;
                break;
            }
            node = node.Next;
        } while (node != Head);
    }

    public void Display() {
        Node node = Head;
        if (Head != null) {
            do {
                System.out.print(node.data + " -> ");
                node = node.Next;
            } while (node != Head);
            System.out.println("HEAD");
        }
    }

    private class Node {
        int data;
        Node Next;

        public Node(int data) {
            this.data = data;
        }
    }
}
