import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        // int arr[] = { 5, 4, 3, 2, 1 };
        // int arr[] = { 3, 1, 5, 4, 2 };
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Swap(int arr[], int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }

    static void BubbleSort(int arr[]) {
        boolean Swapped;
        // Run the Steps N-1 Times
        for (int i = 0; i < arr.length; i++) {
            Swapped = false;
            // For Each Step, Max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {

                // Swap if the item is Smaller than the Previous item
                if (arr[j] < arr[j - 1]) {
                    // Swap
                    Swap(arr, j, j - 1);
                    Swapped = true;
                }
            }
            // If you did not Swap for a particular value of i
            // It means the array is sorted hence the stop the program
            if (!Swapped) {
                break;
            }
        }
    }
}