
public class Rotated_Array_Binary_03 {
    public static void main(String[] args) {

        int arr[] = { 5, 6, 7, 8, 9, 1, 2, 3 };
        int Ans = BinarySearch(arr, 7, 0, arr.length - 1);
        System.out.println(Ans);
    }

    static int BinarySearch(int arr[], int target, int Start, int End) {
        if (Start > End) {
            return -1;
        }
        int Mid = Start + (End - Start) / 2;
        if (arr[Mid] == target) {
            return Mid;
        }
        if (arr[Start] <= arr[Mid]) {
            if (target >= arr[Start] && target <= arr[Mid]) {
                return BinarySearch(arr, target, Start, Mid - 1);
            } else {
                return BinarySearch(arr, target, Mid + 1, End);
            }
        }
        if (target > arr[Mid] && target <= arr[End]) {
            return BinarySearch(arr, target, Mid + 1, End);
        }
        return BinarySearch(arr, target, Start, Mid - 1);
    }
}