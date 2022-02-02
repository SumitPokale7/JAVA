// https://leetcode.com/problems/build-array-from-permutation/

// Build Array from Permutation

public class Build_An_Array_Permutation {
    public static void main(String[] args) {
        int Nums[] = { 0, 2, 1, 5, 3, 4 };

        System.out.println(buildArray(Nums));
    }

    static public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + 1000 * (nums[nums[i]] % 1000);
        }
        for (int j = 0; j < n; j++) {
            nums[j] /= 1000;
        }
        return nums;
    }
}