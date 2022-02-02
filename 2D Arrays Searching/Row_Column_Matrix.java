import java.util.Arrays;

// Matrix is Sorted in a Row wise, & Column Wise Manner.

public class Row_Column_Matrix {

    public static void main(String[] args) {

        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        System.out.println(Arrays.toString(Search(arr, 37)));
    }

    static int[] Search(int Matrix[][], int target) {
        int Row = 0;
        int Column = Matrix.length - 1;

        while (Row < Matrix.length && Column >= 0) {
            if (Matrix[Row][Column] == target) {
                return new int[] { Row, Column };
            }
            if (Matrix[Row][Column] < target) {
                Row++;
            } else {
                Column--;
            }
        }
        return new int[] { -1, -1 };
    }
}
