import java.util.Arrays;

// 1. Divide array into 2 Parts
// 2. Get Both Part Sorted Via Recursion
// 3. Merge two Sorted Arrays

// Complexity 
// Time   --> O(N * (log N))
// Space --> O(N)

// 1. At Every level, N Element are being Merged

public class Merge_Sort {
    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1 };
        // arr = MergeSort(arr);
        MergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] MergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int Mid = arr.length / 2;

        int Left[] = MergeSort(Arrays.copyOfRange(arr, 0, Mid));
        int Right[] = MergeSort(Arrays.copyOfRange(arr, Mid, arr.length));

        return Merge(Left, Right);
    }

    static int[] Merge(int First[], int Second[]) {
        int Mix[] = new int[First.length + Second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < First.length && j < Second.length) {
            if (First[i] < Second[j]) {
                Mix[k] = First[i];
                i++;
            } else {
                Mix[k] = Second[j];
                j++;
            }
            k++;
        }
        // It may be Possible that one of the Arrays is not Complete
        // Copy the Remaining Element
        while (i < First.length) {
            Mix[k] = First[i];
            i++;
            k++;
        }
        while (j < Second.length) {
            Mix[k] = Second[j];
            j++;
            k++;
        }
        return Mix;
    }

    static void MergeSortInPlace(int arr[], int Start, int End) {
        if (End - Start == 1) {
            return;
        }
        int Mid = (Start + End) / 2;

        MergeSortInPlace(arr, Start, Mid);
        MergeSortInPlace(arr, Mid, End);

        MergeInPlace(arr, Start, Mid, End);
    }

    static void MergeInPlace(int arr[], int Start, int Mid, int End) {
        int Mix[] = new int[End - Start];

        int i = Start;
        int j = Mid;
        int k = 0;

        while (i < Mid && j < End) {
            if (arr[i] < arr[j]) {
                Mix[k] = arr[i];
                i++;
            } else {
                Mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // It may be Possible that one of the Arrays is not Complete
        // Copy the Remaining Element
        while (i < Mid) {
            Mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < End) {
            Mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < Mix.length; l++) {
            arr[Start + l] = Mix[l];
        }
    }
}