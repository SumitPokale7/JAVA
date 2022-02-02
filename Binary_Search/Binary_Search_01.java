
public class Binary_Search_01 {
    public static void main(String[] args) {

        int arr[] = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int Val = -18;
        int Ans = BinarySearch(arr, Val);
        System.out.println("The Element is Found at Index: " + Ans);
    }
    // Return the Index
    // Return -1 if does not Exist

    // Return the Index: Greatest Number <= Val
    static int BinarySearch(int arr[], int Val) {
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
        return High;
    }
}
