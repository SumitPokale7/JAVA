public class Search_In_Rotated_Sorted_Array_09 {
    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(FindThePivot(arr));
    }

    static int Search(int nums[], int target) {
        int Pivot = FindThePivot(nums);

        // If you did not find the pivot, it means the array is not Rotated
        if (Pivot == -1) {
            // Just do Normal Binary Search
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
        // If Pivot is Found, You have Found 2 Asending Sorted Arrays
        if (nums[Pivot] == target) {
            return Pivot;
        }
        if (Pivot >= nums[0]) {
            return BinarySearch(nums, target, 0, Pivot - 1);
        }
        return BinarySearch(nums, target, Pivot + 1, nums.length - 1);
    }

    static int BinarySearch(int arr[], int Val, int low, int High) {

        while (low <= High) {

            // Find the middle Element
            // int mid = (low + High)/ 2; // Might be possible that (low + High)

            int mid = low + (High - low) / 2;
            if (Val < arr[mid]) {
                High = mid - 1;
            } else if (Val > arr[mid]) {
                low = mid + 1;
            } else {

                // Ans Found
                return mid;
            }
        }
        return High;
    }

    // This will Not Work for Duplicate Numbers
    static int FindThePivot(int arr[]) {
        int Start = 0;
        int End = arr.length - 1;
        while (Start <= End) {
            // 4 Cases Over Here
            int Mid = Start + (End - Start) / 2;
            if (Mid < End && arr[Mid] > arr[Mid + 1]) {
                return Mid;
            }
            if (Mid > Start && arr[Mid] < arr[Mid - 1]) {
                return Mid - 1;
            }
            if (arr[Mid] <= arr[Start]) {
                End = Mid - 1;
            } else {
                Start = Mid + 1;
            }
        }
        return -1;
    }
}
