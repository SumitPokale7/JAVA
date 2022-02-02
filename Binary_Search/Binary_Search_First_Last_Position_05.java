public class Binary_Search_First_Last_Position_05 {

    public static void main(String[] args) {

    }

    public int[] SearchRange(int nums[], int target) {

        int Ans[] = { -1, -1 };

        // Check for first occurence if target first

        Ans[0] = Search(nums, target, true);
        if (Ans[0] != -1) {

            Ans[1] = Search(nums, target, false);
        }
        return Ans;
    }

    // This Function just returns the index value of target
    int Search(int nums[], int target, boolean FindStartIndex) {

        int Ans = -1;

        // Check for first occurence if target first

        int low = 0;
        int High = nums.length - 1;

        while (low <= High) {

            // Find the middle Element
            // int mid = (low + High)/ 2; // Might be possible that (low + High)

            int mid = low + (High - low) / 2;
            if (target < nums[mid]) {
                High = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                // Potential Ans Found
                if (FindStartIndex) {
                    High = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return Ans;
    }
}
