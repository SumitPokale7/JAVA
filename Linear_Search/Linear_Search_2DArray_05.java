import java.util.Arrays;

public class Linear_Search_2DArray_05 {
    public static void main(String[] args) {

        int arr[][] = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 22 }
        };

        int Val = 56;
        int Ans[] = Search(arr, Val); // --> Format of return Value {start, end}
        System.out.println(Arrays.toString(Ans));
    }

    static int[] Search(int arr[][], int Val) {

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == Val) {
                    return new int[] { row, column };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
