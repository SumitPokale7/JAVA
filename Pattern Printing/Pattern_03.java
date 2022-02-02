
public class Pattern_03 {
    public static void main(String[] args) {
        PatternPrint4(5);
    }

    static void PatternPrint4(int n) {
        for (int Row = 1; Row <= n; Row++) {
            for (int Col = 1; Col <= Row; Col++) {
                System.out.print(Col + " ");
            }
            System.out.println();
        }
    }
}
