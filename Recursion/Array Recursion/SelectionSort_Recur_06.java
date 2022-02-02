import java.util.Arrays;

public class SelectionSort_Recur_06 {
    public static void main(String[] args) {

        int arr[] = { 4, 3, 2, 1 };
        SelectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int arr[], int Row, int Col, int Max) {
        if (Row == 0) {
            return;
        }
        if (Col < Row) {
            if (arr[Col] > arr[Max]) {
                SelectionSort(arr, Row, Col + 1, Col);
            } else {
                SelectionSort(arr, Row, Col + 1, Max);
            }
        } else {
            int temp = arr[Max];
            arr[Max] = arr[Row - 1];
            arr[Row - 1] = temp;
            SelectionSort(arr, Row - 1, 0, 0);
        }
    }
}
