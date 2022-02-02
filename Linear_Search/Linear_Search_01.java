public class Linear_Search_01 {

    // Search in the array: return the index if item found
    // otherwise if item not found return -1
    static int LinearSearch(int arr[], int Val) {
        if (arr.length == 0) {
            return -1;
        }

        for (int Index = 0; Index < arr.length; Index++) {
            // Check for element at every index if the == Val
            int elem = arr[Index];
            if (elem == Val) {
                return Index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 23, 85, -1, 79, 598, 54, 7545, 889, 78, 95, 35, 21 };
        int Val = -1;
        int Ans = LinearSearch(arr, Val);
        System.out.printf("The %d is found at index: %d", Val, Ans);
    }
}