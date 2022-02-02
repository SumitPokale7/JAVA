
public class Human_01 implements Cloneable {
    int Age;
    String Name;
    int[] arr;

    public Human_01(int age, String name) {
        Age = age;
        Name = name;
        this.arr = new int[] { 3, 4, 5, 6, 7, 8, 9 };
    }

    // public Human_01(Human_01 OtherHuman) {
    // this.Age = OtherHuman.Age;
    // this.Name = OtherHuman.Name;
    // }

    public Object clone() throws CloneNotSupportedException {
        // This is Shallow Copy
        return super.clone();
    }

}