public class CustomStack_01 {

    public static void main(String[] args) throws StackException_01 {
        CustomStack_01 stack = new CustomStack_01(5);
        stack.push(55);
        stack.push(5);
        stack.push(56);
        stack.push(45);
        stack.push(85);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack_01() {
        this(DEFAULT_SIZE);
    }

    public CustomStack_01(int Size) {
        this.data = new int[Size];
    }

    public boolean push(int item) {

        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException_01 {
        if (isEmpty()) {
            throw new StackException_01("Cannot pop from an Empty Stack!!");
        }
        // int Removed = data[ptr];
        // ptr--;
        // return Removed;
        return data[ptr--];
    }

    public int peek() throws StackException_01 {
        if (isEmpty()) {
            throw new StackException_01("Cannot peek from an Empty Stack!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
