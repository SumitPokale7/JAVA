public class Binary_Search_Infinite_Array_06 {
    public static void main(String[] args) {

        int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(Ans(arr, target));
    }

    static int Ans(int arr[], int target) {

        // First Find the Range
        // Start with box of Size 2
        int Start = 0;
        int End = 1;

        // Condition for the Target to the lie in the Range
        while (target > arr[End]) {
            int temp = End + 1; // --> This is my new Start
            // Double the Box Value
            // End = Previous End + sizeofbox*2;
            End = End + (End - Start + 1) * 2;
            Start = temp;
        }

        return BinarySearch(arr, target, Start, End);
    }

    static int BinarySearch(int arr[], int target, int Start, int End) {
        int low = 0;
        int High = arr.length - 1;

        while (low <= High) {

            // Find the middle Element
            // int mid = (low + High)/ 2; // Might be possible that (low + High)

            int mid = low + (High - low) / 2;
            if (target < arr[mid]) {
                High = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {

                // Ans Found
                return mid;
            }
        }
        return High;
    }
}
