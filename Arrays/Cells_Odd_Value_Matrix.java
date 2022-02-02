// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

// Cells with Odd Values in a Matrix

public class Cells_Odd_Value_Matrix {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int indices[][] = { { 0, 1 }, { 1, 1 } };
        int Ans = oddCells(m, n, indices);
        System.out.println(Ans);
    }

    // public int oddCells(int m, int n, int[][] indices) {

    // int arr[][] = new int[m][n];

    // for (int i = 0; i < indices.length; i++) {
    // // Increment all the cells on Row
    // int Row = indices[i][0];
    // for (int j = 0; j < i; j++) {
    // arr[Row][j]++;
    // }
    // // Increment all the Cells on Column
    // int Col = indices[i][1];
    // for (int j = 0; j < arr.length; j++) {
    // arr[j][Col]++;
    // }
    // }
    // int Count = 0;
    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // if (arr[i][j] % 2 != 0) {
    // Count++;
    // }
    // }
    // }
    // return Count;
    // }

    static public int oddCells(int m, int n, int[][] indices) {
        int Row[] = new int[m];
        int Col[] = new int[n];
        for (int[] index : indices) {
            Row[index[0]]++;
            Col[index[1]]++;
        }
        int Count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((Row[i] + Col[j]) % 2 != 0) {
                    Count++;
                }
            }
        }
        return Count;
    }
}
