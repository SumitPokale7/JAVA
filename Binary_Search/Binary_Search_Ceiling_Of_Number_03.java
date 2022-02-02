public class Binary_Search_Ceiling_Of_Number_03 {
    public static void main(String[] args) {

        int Arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int Val = 15;
        int Ans = Ceiling(Arr, Val);
        System.out.println("The Element is Found at Index: " + Ans);
    }

    // Return the index of smalllest no>= Val

    static int Ceiling(int arr[], int Val) {

        // But what if the target is greater than the greatest number in the array
        if (Val > arr[arr.length - 1]) {
            return -1;
        }

        int low = 0;
        int High = arr.length - 1;

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
        return low;
    }
}
