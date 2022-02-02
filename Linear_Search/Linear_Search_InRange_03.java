public class Linear_Search_InRange_03 {

    // Search in the array: return the index if item found
    // otherwise if item not found return -1
    static int LinearSearch(int arr[], int Val, int start, int end) {
        if (arr.length == 0) {
            System.out.println("The Value is Not Found");
            return -1;
        }

        for (int Index = start; Index <= end; Index++) {
            // Check for element at every index if the == Val
            int elem = arr[Index];
            if (elem == Val) {
                return Index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 18, 12, -7, 3, 14, 28 };
        int Val = 28;
        int Ans = LinearSearch(arr, Val, 1, 4);
        System.out.printf("The %d is found at index: %d", Val, Ans);
    }
}