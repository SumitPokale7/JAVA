public class Binary_Search_Find_MountainArray_08 {
    public static void main(String[] args) {

    }

    int Search(int arr[], int target) {
        int Peak = PeakIndexInMounatinArray(arr);
        int FirstTry = OrderDiagnosticsBS(arr, target, 0, Peak);
        if (FirstTry != -1) {
            return -1;
        }
        // Try to Search in 2nd Half
        return OrderDiagnosticsBS(arr, target, Peak + 1, arr.length - 1);
    }

    public int PeakIndexInMounatinArray(int arr[]) {
        int Start = 0;
        int End = arr.length - 1;

        while (Start < End) {
            int Mid = Start + (End - Start) / 2;
            if (arr[Mid] > arr[Mid + 1]) {
                // You Are in Decreasing part of Array
                // This may be the Ans, but look at left
                // This is why End != Mid - 1;
                End = Mid;
            } else {
                // You are in Ascending Part of Array
                Start = Mid + 1; // Because we know that Mid + 1 Element > Mid Element

            }
        }
        // In the End, Start == End and Poiting to the largest Number Because of 2
        // Checks
        // Start And End Are always trying to find max Element in the above 2 Check
        // Hence, they are Pointing to just One Element, That is the Max one Because
        // that is what Check Says
        // At Every Point of time for Start and End
        return Start;
    }

    static int OrderDiagnosticsBS(int Arr[], int Val, int Start, int End) {

        boolean IsAsc = Arr[Start] < Arr[End];

        while (Start <= End) {

            // Find the middle Element
            // int mid = (Start + End)/ 2; // Might be possible that (Start + End)
            int mid = Start + (End - Start) / 2;

            if (Arr[mid] == Val) {
                return mid;
            }

            if (IsAsc) {
                if (Val < Arr[mid]) {
                    End = mid - 1;
                } else {

                    Start = mid + 1;
                }
            } else {
                if (Val > Arr[mid]) {
                    End = mid - 1;
                } else {
                    Start = mid + 1;
                }
            }
        }
        return -1;
    }
}
