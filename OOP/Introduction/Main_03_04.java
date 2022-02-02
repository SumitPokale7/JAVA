public class Main_03_04 {
    public static void main(String[] args) {

        // Human_03 Sumit = new Human_03(18, "Sumit", 0, false);
        // Human_03 Kunal = new Human_03(22, "Kunal Kushwaha", 5000000, true);
        // Human_03 Arpit = new Human_03(22, "Arpit", 5000000, false);

        // System.out.println(Human_03.Population);
        // System.out.println(Human_03.Population);
        // System.out.println(Human_03.Population);

        // Greeting();
    }

    // This is Not - dependent on Objects
    static void fun() {

        // Greeting();

        // You Can't use this because it Requires an instance but the
        // Function you are using it in does not depend on Instances

        // You Cannot Access Non-Static Stuff without Refrence their
        // instances in a Static Context

        // Hence, here we are Referencing it.
        Main_03_04 obj = new Main_03_04();
        obj.Greeting();
    }

    // We know that, Something which is not Static, belongs to an Object
    void Greeting() {
        System.out.println("Hello World");
    }
}
