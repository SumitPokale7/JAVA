import java.util.Arrays;

// Q. Search in a Sorted Array

public class Sorted_Matrix {
    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        System.out.println(Arrays.toString(Search(arr, 9)));
    }

    // Search in the Row Provided Between the Col Provided
    static int[] BinarySearch(int Matrix[][], int Row, int ColStart, int ColEnd, int target) {
        while (ColStart <= ColEnd) {
            int Mid = ColStart + (ColEnd - ColStart) / 2;
            if (Matrix[Row][Mid] == target) {
                return new int[] { Row, Mid };
            }
            if (Matrix[Row][Mid] < target) {
                ColStart = Mid + 1;
            } else {
                ColEnd = Mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] Search(int Matrix[][], int target) {
        int Row = Matrix.length;
        int Col = Matrix[0].length; // Be Cautions, Matrix may be Empty
        if (Col == 0) {
            return new int[] { -1, -1 };
        }
        if (Row == 1) {
            return BinarySearch(Matrix, 0, 0, Col - 1, target);
        }

        int RowStart = 0;
        int RowEnd = Row - 1;
        int ColMid = Col / 2;

        // Run the Loop till 2 Rows Remaining
        while (RowStart < (RowEnd - 1)) {
            // While this is true it will have more than 2 Rows
            int Mid = RowStart + (RowEnd - RowStart) / 2;
            if (Matrix[Mid][ColMid] == target) {
                return new int[] { Mid, ColMid };
            }
            if (Matrix[Mid][ColMid] < target) {
                RowStart = Mid;
            } else {
                RowEnd = Mid;
            }
        }
        // Now we Have 2 Rows
        // Check Wheather the target is in the col of 2 Rows
        if (Matrix[RowStart][ColMid] == target) {
            return new int[] { RowStart, ColMid };
        }
        if (Matrix[RowStart + 1][ColMid] == target) {
            return new int[] { RowStart + 1, ColMid };
        }

        // Search in 1st Half
        if (target <= Matrix[RowStart][ColMid - 1]) {
            return BinarySearch(Matrix, RowStart, 0, ColMid - 1, target);
        }
        // Search in 2st Half
        if (target >= Matrix[RowStart][ColMid + 1] && target <= Matrix[RowStart][ColMid - 1]) {
            return BinarySearch(Matrix, RowStart, ColMid + 1, Col - 1, target);
        }
        // Search in 3st Half
        if (target <= Matrix[RowStart + 1][ColMid - 1]) {
            return BinarySearch(Matrix, RowStart + 1, 0, ColMid - 1, target);
        }
        // Search in 4st Half
        else {
            return BinarySearch(Matrix, RowStart + 1, ColMid + 1, Col - 1, target);
        }
    }
}
