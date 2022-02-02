
//  This is a demo to Show Initalization of Static Variables

public class Static_Block_05 {
    static int a = 5;
    static int b;

    // Will Only run once, when the First obj is Create
    // i.e. When the Class is loaded for the first time.

    static {
        System.out.println("I am in Static Block");
        b = a * 5;
    }

    public static void main(String[] args) {
        // Static_Block_05 obj = new Static_Block_05();
        // System.err.println(Static_Block_05.a + " " + Static_Block_05.b);

        // Static_Block_05.b += 3;

        // Static_Block_05 obj2 = new Static_Block_05();
        // System.err.println(Static_Block_05.a + " " + Static_Block_05.b);
    }
}
