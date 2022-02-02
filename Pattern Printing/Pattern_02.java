public class Pattern_02 {
    public static void main(String[] args) {
        PrintPattern2(5);
    }

    static void PrintPattern1(int n) {
        for (int Row = 0; Row < n; Row++) {
            for (int Col = 0; Col < Row; Col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void PrintPattern2(int n) {
        for (int Row = 0; Row < n; Row++) {
            for (int Col = 0; Col < n - Row + 1; Col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
