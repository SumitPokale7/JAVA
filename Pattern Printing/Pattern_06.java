public class Pattern_06 {
    public static void main(String[] args) {
        PrintPattern31(5);
    }

    static void PrintPattern31(int n) {
        int OriginalN = n;
        n = 2 * n;
        for (int Row = 0; Row <= n; Row++) {
            for (int Col = 0; Col <= n; Col++) {
                int AtEveryIndex = OriginalN - Math.min(Math.min(Row, Col), Math.min(n - Row, n - Col));
                System.out.print(AtEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
