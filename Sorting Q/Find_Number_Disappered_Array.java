// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

// Find All Numbers Disappeared in an Array

import java.util.List;
import java.util.ArrayList;

public class Find_Number_Disappered_Array {
    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] arr) {
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
        List<Integer> Ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                Ans.add(index + 1);
            }
        }
        return Ans;
    }

    static void Swap(int arr[], int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
