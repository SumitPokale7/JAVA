public class CircularQueue_04 {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int End = 0;
    int Front = 0;

    private int Size = 0;

    public CircularQueue_04() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue_04(int Size) {
        this.data = new int[Size];
    }

    public boolean isFull() {
        return Size == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return Size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[End++] = item;
        End = End % data.length;
        Size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int Removed = data[Front];

        Front = Front % data.length;
        Size--;

        return Removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[Front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = Front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i %= data.length;
        } while (i != End);
        System.out.println("END");
    }

}
