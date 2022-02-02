public class Pattern_04 {
    public static void main(String[] args) {
        PrintPattern4(5);
    }

    static void PrintPattern4(int n) {
        for (int Row = 1; Row <= 2 * n; Row++) {
            int TotalRowinCol = Row > n ? 2 * n - Row : Row;
            for (int Col = 0; Col <= TotalRowinCol; Col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
