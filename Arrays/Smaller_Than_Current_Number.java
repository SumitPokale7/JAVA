// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

// How Many Numbers Are Smaller Than the Current Number

class Smaller_Than_Current_Number {
    public static void main(String[] args) {

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int arr[] = new int[nums.length];
        int k = 0;
        int i = 0;
        int Count = 0;
        while (k < nums.length) {
            if (nums[k] > nums[i] && k != i && nums[k] < nums[i]) {
                Count++;
            }
            arr[i] = Count;
        }
        return arr;

        // Time Complexity--> O(n)
        // int[] freq = new int[101];
        // int[] smaller = new int[101];
        // for(int num : nums) {
        // freq[num] ++;
        // }
        // int runner = 0;
        // for(int i = 0; i <= 100; i ++) {
        // smaller[i] = runner;
        // runner += freq[i];
        // }
        // for(int i = 0; i < nums.length; i ++) {
        // nums[i] = smaller[nums[i]];
        // }
        // return nums;
    }
}