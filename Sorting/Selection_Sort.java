import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 4, 2 };
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SwapArray(int arr[], int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }

    static public void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // Find the Max item in the remaining arrays
            // and Swap with Correct Index
            int last = arr.length - i - 1;
            int MaxInd = GetMaxIndex(arr, 0, last);
            SwapArray(arr, MaxInd, last);
        }
    }

    static int GetMaxIndex(int arr[], int Start, int End) {
        int Max = Start;

        for (int i = Start; i <= End; i++) {
            if (arr[Max] > arr[i]) {
                Max = i;
            }
        }
        return Max;
    }
}
