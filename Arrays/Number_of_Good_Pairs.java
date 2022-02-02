// https://leetcode.com/problems/number-of-good-pairs/

// Number of Good Pairs

public class Number_of_Good_Pairs {
    public static void main(String[] args) {

    }

    public int numIdenticalPairs(int[] nums) {
        int Count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    Count++;
                }
            }
        }
        return Count;
    }
}
