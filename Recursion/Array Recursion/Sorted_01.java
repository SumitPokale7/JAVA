
public class Sorted_01 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 52, 6, 8 };
        System.out.println(Sorted(arr, 0));
    }

    static boolean Sorted(int arr[], int index) {
        // Base Condition
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && Sorted(arr, index + 1);
    }
}