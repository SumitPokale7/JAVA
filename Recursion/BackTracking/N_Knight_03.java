
// Note:
//  When a choise affect future Ans use backtrac

public class N_Knight_03 {
    public static void main(String[] args) {

        int n = 4;
        boolean Board[][] = new boolean[n][n];
        Knight(Board, 0, 0, 4);
    }

    static void Knight(boolean Board[][], int Row, int Col, int Knights) {
        if (Knights == 0) {
            display(Board);
            System.out.println();
            return;
        }

        if (Row == Board.length && Col == Board.length) {
            return;
        }

        if (Col == Board.length) {
            Knight(Board, Row + 1, 0, Knights);
            return;
        }
        if (IsSafe(Board, Row, Col)) {
            Board[Row][Col] = true;
            Knight(Board, Row, Col + 1, Knights - 1);
            Board[Row][Col] = false;
        }
        Knight(Board, Row, Col + 1, Knights);
    }

    // Do not Repeat yourself, Hence Created this Function
    static boolean IsSafe(boolean Board[][], int Row, int Col) {
        if (isValid(Board, Row - 2, Col - 1)) {
            if (Board[Row - 2][Col - 1]) {
                return false;
            }
        }
        if (isValid(Board, Row - 1, Col - 2)) {
            if (Board[Row - 1][Col - 2]) {
                return false;
            }
        }
        if (isValid(Board, Row - 2, Col + 1)) {
            if (Board[Row - 2][Col + 1]) {
                return false;
            }
        }
        if (isValid(Board, Row - 1, Col + 2)) {
            if (Board[Row - 1][Col + 2]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean Board[][], int Row, int Col) {
        if (Row >= 0 && Row < Board.length && Col >= 0 && Col < Board.length) {
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for (boolean[] Row : board) {
            for (boolean Element : Row) {
                if (Element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.err.println();
        }
    }
}
