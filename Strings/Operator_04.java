import java.util.ArrayList;

public class Operator_04 {
    public static void main(String[] args) {
        // Note

        // When an Integer is concatenated with a String it is Converted
        // to it's Wrapper Class Integer
        // Integer will be Converted to Integer that will Call .tostring()

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));

        System.out.println("Kunal" + new ArrayList<>());

    }
}
