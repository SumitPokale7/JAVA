// https://leetcode.com/problems/matrix-diagonal-sum/

// Matrix Diagonal Sum

public class Matrix_Digonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int Ans = diagonalSum(mat);
        System.out.println(Ans);
    }

    static public int diagonalSum(int[][] mat) {

        int A = 0, B = 0;
        for (int i = 0; i < mat.length; i++) {
            // Forward
            A += mat[i][i];
            // Backward
            B += mat[i][mat.length - i - 1];
        }

        // Fence post Situation for odd Matrix
        if (mat.length % 2 == 1) {
            B -= mat[mat.length / 2][mat.length / 2];
        }
        int C = A + B;

        return C;
    }
}
