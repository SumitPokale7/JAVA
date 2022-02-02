
public class Comparison_01 {
    public static void main(String[] args) {
        String A = "Kunal";
        String B = "Kunal";

        // == This is a Comparator
        // --> Checks if Reference Variable are Pointing
        // to Same obj
        System.out.println(A == B);

        // How to Create Different Obj of Same Value

        // Creating these Values OutSide the Pool/ But in Heap
        String Name1 = new String("Kunal");
        String Name2 = new String("Kunal");
        // System.out.println(Name1 == Name2);

        // .equals --> This is a Method --> Checks the Values
        System.out.println(Name1.equals(Name2));

        System.out.println(Name1.charAt(0));
    }
}