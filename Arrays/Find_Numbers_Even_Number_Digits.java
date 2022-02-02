// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

// Incomplete
// Find Numbers with Even Number of Digits

public class Find_Numbers_Even_Number_Digits {
    public static void main(String[] args) {

        int nums[] = { 12, 345, 2, 6, 7896 };
        int Ans = findNumbers(nums);
        System.out.println(Ans);
    }

    static public int findNumbers(int[] nums) {
        int Counter = 0;
        for (int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);
            if ((s.length()) % 2 == 0) {
                Counter++;
            }
        }
        return Counter;
    }
}
