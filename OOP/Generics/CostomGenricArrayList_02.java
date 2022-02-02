import java.util.Arrays;

public class CostomGenricArrayList_02<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int Size = 0; // Also Working as Index value

    public CostomGenricArrayList_02() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(float f) {
        if (this.isFull()) {
            resize();
        }
        data[Size++] = f;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // Copy the Current Items in the new Array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return Size == data.length;
    }

    public T remove() {
        T removed = (T) (data[--Size]);
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int Size() {
        return Size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CostomGenricArrayList_02 [Size=" + Size + ", data=" + Arrays.toString(data) + "]";
    }

    public static void main(String[] args) {
        // ArrayList list2 = new ArrayList<>();

        CostomGenricArrayList_02<Integer> list = new CostomGenricArrayList_02<>();

        list.add(58);
        list.add(5);
        list.add(8);

        System.out.println(list);
    }
}
