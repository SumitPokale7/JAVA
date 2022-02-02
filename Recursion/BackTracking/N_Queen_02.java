
// Note:
//  When a choise affect future Ans use backtrac

//  Doubts ?
//  How do we Know this is Recursion?
//  We Know that Queens Will be Not in the Same Col & Row 
//  At the Same time, if there were they Cancel each other

//  Time Complexity

//  Recurence Relation --> T(N) = N * T(N-1) + O(N^2)

//  O(N^3 + N!) = O(N)

public class N_Queen_02 {
    public static void main(String[] args) {
        int n = 4;
        boolean Board[][] = new boolean[n][n];
        System.out.println((Queens(Board, 0)));
    }

    static int Queens(boolean Board[][], int Row) {
        if (Row == Board.length) {
            display(Board);
            System.out.println();
            return 1;
        }

        int Count = 0;
        // Placing the Queen and Checking for Every Row and Col
        for (int Col = 0; Col < Board.length; Col++) {
            // Place the Queen if it is Safe
            if (IsSafe(Board, Row, Col)) {
                Board[Row][Col] = true;
                Count += Queens(Board, Row + 1);
                Board[Row][Col] = false;
            }
        }
        return Count;
    }

    static boolean IsSafe(boolean Board[][], int Row, int Col) {
        // Check vertical Row
        for (int i = 0; i < Row; i++) {
            if (Board[i][Col]) {
                return false;
            }
        }
        // Diagonal left
        int MaxLeft = Math.min(Row, Col);
        for (int i = 1; i <= MaxLeft; i++) {
            if (Board[Row - i][Col - i]) {
                return false;
            }
        }
        // Diagonal Right
        int MaxRight = Math.min(Row, Board.length - Col - 1);
        for (int i = 1; i <= MaxRight; i++) {
            if (Board[Row - i][Col + i]) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] Row : board) {
            for (boolean Element : Row) {
                if (Element) {
                    System.out.print("Q ");
                }
                System.out.print("X ");
            }
            System.err.println();
        }
    }
}
