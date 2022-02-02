public class Human_03 {
    int age;
    String Name;
    int Salary;
    boolean Married;
    static long Population;

    static void Message() {
        System.out.println("Hello World");

        // System.out.println(this.age); // Can't use this over here
    }

    public Human_03(int age, String Name, int Salary, boolean Married) {
        this.age = age;
        this.Name = Name;
        this.Salary = Salary;
        this.Married = Married;
        Human_03.Population += 1;
    }
}
