
// https://leetcode.com/problems/sudoku-solver/

// Sudoku Solver

//  Time Complexity 
//  O(9^n^2)

public class Sudoku_Solver_04 {
    public static void main(String[] args) {
        int[][] board = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (Solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    static boolean Solve(int Board[][]) {
        int n = Board.length;
        int Row = -1;
        int Col = -1;

        boolean EmptyLeft = true;

        // This is How we are Replacing the Row, Col, from Arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Board[i][j] == 0) {
                    Row = i;
                    Col = j;
                    EmptyLeft = false;
                    break;
                }
            }
            // If you foud some empty Element in Row,
            // then Break
            if (EmptyLeft == false) {
                break;
            }
        }
        if (EmptyLeft == true) {
            return true;
            // Soduko is Solved
        }
        // BackTrack
        for (int Number = 1; Number <= 9; Number++) {
            if (isSafe(Board, Row, Col, Number)) {
                Board[Row][Col] = Number;
                if (Solve(Board)) {
                    // Found the Ans
                    return true;
                } else {
                    // BackTrack
                    Board[Row][Col] = 0;
                }
            }
        }
        return false;
    }

    static void display(int Board[][]) {
        for (int[] Row : Board) {
            for (int num : Row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int Board[][], int Row, int Col, int num) {
        // Check the Row
        for (int i = 0; i < Board.length; i++) {
            // Check if the Number is in the Row
            if (Board[Row][i] == num) {
                return false;
            }
        }
        // Check the Col
        for (int[] nums : Board) {
            // Check if the Number is in the Col
            if (nums[Col] == num) {
                return false;
            }
        }
        int Sqrt = (int) (Math.sqrt(Board.length));
        int RowStart = Row - Row % Sqrt;
        int ColStart = Col - Col % Sqrt;

        for (int r = RowStart; r < RowStart + Sqrt; r++) {
            for (int C = ColStart; C < ColStart + Sqrt; C++) {
                if (Board[Row][Col] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
