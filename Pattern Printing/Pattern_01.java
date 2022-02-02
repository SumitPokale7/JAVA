
public class Pattern_01 {
    public static void main(String[] args) {
        PrintPattern1(4);
    }

    static void PrintPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}