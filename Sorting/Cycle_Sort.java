import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 1, 4 };
        Cyclic_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SwapArray(int arr[], int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }

    static void Cyclic_Sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int Correct = arr[i] - 1;
            if (arr[i] != arr[Correct]) {
                SwapArray(arr, i, Correct);
            } else {
                i++;
            }
        }
    }
}
