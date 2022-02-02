// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

// Two Sum II - Input Array Is Sorted

public class Two_Sum_II_Sorted_Array {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] { i + 1, j + 1 };
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {};
    }
}
