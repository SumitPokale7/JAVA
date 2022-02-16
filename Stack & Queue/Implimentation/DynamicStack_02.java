public class DynamicStack_02 extends CustomStack_01 {

    public DynamicStack_02() {
        super(); // It will Call CustomStack()
    }

    public DynamicStack_02(int Size) {
        super(Size); // It will Call CustomStack(int Size)
    }

    @Override
    public boolean push(int item) {
        // This Takes care of it's being Full
        if (this.isFull()) {
            // Double the Array Size
            int[] temp = new int[data.length * 2];

            // Copy All Prev item in new Array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // At this point we know that Array is not full
        // Insert item
        return super.push(item);
    }

}
