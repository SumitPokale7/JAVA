// https://leetcode.com/problems/find-the-duplicate-number/

// Find the Duplicates in an Array 
// ipcgames.com

public class Find_the_Duplicate {
    public static void main(String[] args) {

    }

    public int findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int Correct = arr[i] - 1;
                if (arr[i] != arr[Correct]) {
                    Swap(arr, i, Correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void Swap(int arr[], int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
