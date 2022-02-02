
import java.util.Arrays;

public class BubbleSort_Recur_05 {
    public static void main(String[] args) {

        int arr[] = { 4, 3, 2, 1 };
        BubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int arr[], int Row, int Col) {
        if (Row == 0) {
            return;
        }
        if (Col < Row) {
            if (arr[Col] > arr[Col + 1]) {
                // Swap
                int temp = arr[Col];
                arr[Col] = arr[Col + 1];
                arr[Col + 1] = temp;
            }
            BubbleSort(arr, Row, Col + 1);
        } else {
            BubbleSort(arr, Row - 1, 0);
        }
    }
}
