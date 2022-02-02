// https://leetcode.com/problems/shuffle-the-array/submissions/

// Shuffle the Array

public class Shuffle_Array {
    public static void main(String[] args) {

    }

    static public int[] shuffle(int[] nums, int n) {
        int A = 0;
        int i = 0;
        int j = n;
        int Arr[] = new int[2 * n];

        while (i < n && j < n * 2) {

            Arr[A] = nums[i];
            Arr[A + 1] = nums[j];
            A += 2;
            i++;
            j++;
        }
        return Arr;
    }
}