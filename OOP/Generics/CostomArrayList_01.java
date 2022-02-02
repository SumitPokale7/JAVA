
//  1. Can Reuse the Particular Code Sample for Various data types
//      Even data types I Create
//  2. Type Safety

import java.util.Arrays;

public class CostomArrayList_01 {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int Size = 0; // Also Working as Index value

    public CostomArrayList_01() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (this.isFull()) {
            resize();
        }
        data[Size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // Copy the Current Items in the new Array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return Size == data.length;
    }

    public int remove() {
        int removed = data[--Size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int Size() {
        return Size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CostomArrayList_01 [Size=" +
                Size + ", data=" + Arrays.toString(data) + "]";
    }

    public static void main(String[] args) {
        // ArrayList list2 = new ArrayList<>();

        CostomArrayList_01 list = new CostomArrayList_01();

        list.add(3);
        list.add(5);
        list.add(8);

        System.out.println(list);
    }
}