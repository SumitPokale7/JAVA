package Comaparing_object;

import java.util.Arrays;

public class Student_01 implements Comparable<Student_01> {
    int Roll_No;
    float Marks;

    public Student_01(int roll_No, float marks) {
        this.Roll_No = roll_No;
        this.Marks = marks;
    }

    @Override
    public int compareTo(Student_01 o) {
        int diff = (int) (this.Marks - o.Marks);

        // if diff == 0; means both are equal
        // if diff < 0; means o is bigger else o is Smalller
        return diff;
    }

    @Override
    public String toString() {
        return Marks + " ";
    }

    public static void main(String[] args) {
        Student_01 Kunal = new Student_01(12, 80.0f);
        Student_01 Rahul = new Student_01(5, 89.0f);
        Student_01 Aroit = new Student_01(2, 85.0f);
        Student_01 Karan = new Student_01(13, 77.0f);
        Student_01 Sachin = new Student_01(10, 96.0f);

        Student_01[] list = { Kunal, Rahul, Aroit, Karan, Sachin };

        System.out.println(Arrays.toString(list));

        // Arrays.sort(list, new Comparator<Student_01>() {
        // @Override
        // public int compare(Student_01 o1, Student_01 o2) {
        // return (int) (o1.Marks - o2.Marks);
        // }
        // });

        // Lambda Expression
        Arrays.sort(list, (o1, o2) -> (int) (o1.Marks - o2.Marks));

        System.out.println(Arrays.toString(list));

        // if (Kunal.compareTo(Rahul) < 0) {
        // System.out.println(Kunal.compareTo(Rahul));
        // System.out.println("Rahul has more Marks");
        // }
    }
}
