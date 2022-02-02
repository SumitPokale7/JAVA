
public class Deep_Copy_02 implements Cloneable {
    int Age;
    String Name;
    int[] arr;

    public Deep_Copy_02(int age, String name) {
        Age = age;
        Name = name;
        this.arr = new int[] { 3, 4, 5, 6, 7, 8, 9 };
    }

    // public Human_01(Human_01 OtherHuman) {
    // this.Age = OtherHuman.Age;
    // this.Name = OtherHuman.Name;
    // }

    public Object clone() throws CloneNotSupportedException {
        // This is Deep Copy
        Deep_Copy_02 Twin = (Deep_Copy_02) super.clone(); // This is Actually Shallow Copy

        // Make a Deep Copy
        Twin.arr = new int[Twin.arr.length];
        for (int i = 0; i < Twin.arr.length; i++) {
            Twin.arr[i] = this.arr[i];
        }
        return Twin;
    }

}