import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_00 {
    public static void main(String[] args) {

        // Stack<Integer> stack = new Stack<>();

        // stack.push(55);
        // stack.push(35);
        // stack.push(45);
        // stack.push(25);
        // stack.push(15);
        // stack.push(5);

        // System.out.println(stack.pop());

        // Queue<Integer> queue = new LinkedList<>();

        // queue.add(66);
        // queue.add(55);
        // queue.add(5);
        // queue.add(75);
        // queue.add(45);
        // queue.add(35);

        // System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(55);
        deque.addLast(45);
    }
}