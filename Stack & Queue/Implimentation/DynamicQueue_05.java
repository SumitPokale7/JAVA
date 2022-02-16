public class DynamicQueue_05 extends CircularQueue_04 {

    public DynamicQueue_05() {
        super();
    }

    public DynamicQueue_05(int Size) {
        super(Size);
    }

    @Override
    public boolean insert(int item) {
        // This Takes care of it's being Full
        if (this.isFull()) {
            // Double the Array Size
            int[] temp = new int[data.length * 2];

            // Copy All Prev item in new Array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(Front + i) % data.length];
            }
            Front = 0;
            End = data.length;
            data = temp;
        }
        // At this point we know that Array is not full
        // Insert item
        return super.insert(item);
    }
}
