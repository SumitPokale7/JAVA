// https://leetcod e.com/problems/set-mismatch/

// Set Mismatch

public class Set_MisMatch {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int Correct = arr[i] - 1;
            if (arr[i] != arr[Correct]) {
                Swap(arr, i, Correct);
            } else {
                i++;
            }
        }

        // just Find Missing Number

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void Swap(int arr[], int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
