// https://leetcode.com/problems/missing-number/

// Missing Number

public class Missing_Number {
    public static void main(String[] args) {

        int[] nums = { 0, 1 };
        System.out.println(Cyclic_Sort(nums));
    }

    static void Swap(int arr[], int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }

    public static int Cyclic_Sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int Correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[Correct]) {
                Swap(arr, i, Correct);
            } else {
                i++;
            }
        }

        // Search for First Missing Number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        // Case 2
        return arr.length;
    }
}