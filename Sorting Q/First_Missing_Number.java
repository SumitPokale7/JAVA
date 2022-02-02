// https://leetcode.com/problems/first-missing-positive/

// First Missing Positive

public class First_Missing_Number {
    public static void main(String[] args) {

    }

    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int Correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[Correct]) {
                Swap(arr, i, Correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void Swap(int arr[], int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
