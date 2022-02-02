// https://leetcode.com/problems/concatenation-of-array/

// Concatenation of Array

public class Concatenation_of_Array {
    public static void main(String[] args) {

    }

    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int ans[] = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
