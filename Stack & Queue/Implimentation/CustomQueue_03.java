public class CustomQueue_03 {

    public static void main(String[] args) {
        CustomQueue_03 queue = new CustomQueue_03();
        queue.insert(85);
        queue.insert(8);
        queue.insert(75);
        queue.insert(65);
        queue.insert(25);
        queue.insert(15);

        queue.display();
    }

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int End = -1;

    public CustomQueue_03() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue_03(int Size) {
        this.data = new int[Size];
    }

    public boolean isFull() {
        return End == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return End == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[End++] = item;

        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int Removed = data[0];

        // Shift the Element to Left
        for (int i = 1; i < End; i++) {
            data[i - 1] = data[i];
        }
        End--;

        return Removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("END");
    }
}
