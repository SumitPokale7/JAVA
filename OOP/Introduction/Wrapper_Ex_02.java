
public class Wrapper_Ex_02 {
    public static void main(String[] args) {

        // int a = 10;
        // int b = 20;

        // Integer num = new Integer(45);
        // Integer num;

        Integer a = 10;
        Integer b = 20;

        Swap(a, b);

        System.out.println(a + " " + b);

        // final int bonus = 3;
        // bonus++;

        // final A Kunal = new A("Kunal kushwah");
        // Kunal.Name = new A("new Object");

        // Wheb a Non-Primitive is Final, you Cannnot Reassigned it.
        // Kunal = new A("New Object");

        // A obj;
        // for (int i = 0; i < 100000000; i++) {
        // obj = new A("Random Name");
        // }

        A obj = new A("fawajwj");
        System.out.println(obj);
    }

    static void Swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    // final int num; // --> Final variables have to be Initailzed, Always
    // initalize while Declaring

    final int num = 10;
    String Name;

    public A(String Name) {
        this.Name = Name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Distroyed");
    }
}