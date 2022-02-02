public class Search_In_Rotated_Sorted_Array_Duplicate_10 {
    public static void main(String[] args) {

    }

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
            // If Element at Mid, Start, End are Equal then Skip the Dyplicates
            if (arr[Mid] == arr[Start] && arr[Mid] == arr[End]) {
                // Skip the Duplicates]
                // NOTE: What if these elements at Start And End were the Pivot??
                // Check if Start is Pivot
                if (arr[Start] > arr[Start + 1]) {
                    return Start;
                }
                Start++;

                // Check Whether End is Pivot
                if (arr[End] < arr[End - 1]) {
                    return End - 1;
                }
                End--;
            }
            // Left side is Sorted, so Pivot should be Right
            else if (arr[Start] < arr[Mid] || (arr[Start] == arr[Mid] && arr[Mid] > arr[End])) {
                Start = Mid + 1;
            } else {
                End = Mid - 1;
            }
        }
        return -1;
    }
}
