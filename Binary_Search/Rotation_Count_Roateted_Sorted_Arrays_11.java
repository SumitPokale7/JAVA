public class Rotation_Count_Roateted_Sorted_Arrays_11 {
    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(RotationCount(arr));
    }

    static int RotationCount(int arr[]) {

        int Pivot = FindThePivot(arr);
        return Pivot + 1;
    }

    // Use this for Non-Duplicate
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

    // Use this for Non-Duplicate Arrays Number
    static int FindThePivotDuplicate(int arr[]) {
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
