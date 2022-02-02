import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 1, 2 };
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SwapArray(int arr[], int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }

    // Descending Sort in Insertion Sort
    static void InsertionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    SwapArray(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    // Descending Sort in Insertion Sort
    static void InsertionSort2(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    SwapArray(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
