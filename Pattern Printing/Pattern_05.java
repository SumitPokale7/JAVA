public class Pattern_05 {
    public static void main(String[] args) {
        PrintPattern17(5);
    }

    static void PrintPattern28(int n) {
        for (int Row = 1; Row <= 2 * n; Row++) {
            int TotalRowinCol = Row > n ? 2 * n - Row : Row;

            int NoOfSpaces = n - TotalRowinCol;
            for (int S = 0; S < NoOfSpaces; S++) {
                System.out.print(" ");
            }

            for (int Col = 0; Col <= TotalRowinCol; Col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void PrintPattern30(int n) {
        for (int Row = 1; Row <= n; Row++) {
            for (int Spaces = 0; Spaces < n - Row; Spaces++) {
                System.out.print("  ");
            }
            for (int Col = Row; Col >= 1; Col--) {
                System.out.print(Col + " ");
            }

            for (int Col = 2; Col <= Row; Col++) {
                System.out.print(Col + " ");
            }
            System.out.println();
        }
    }

    static void PrintPattern17(int n) {
        for (int Row = 1; Row <= 2 * n - 1; Row++) {

            int c = Row > n ? 2 * n - Row : Row;

            for (int Spaces = 0; Spaces < n - c; Spaces++) {
                System.out.print("  ");
            }
            for (int Col = c; Col >= 1; Col--) {
                System.out.print(Col + " ");
            }

            for (int Col = 2; Col <= c; Col++) {
                System.out.print(Col + " ");
            }
            System.out.println();
        }
    }
}
