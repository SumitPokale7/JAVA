public class Binary_Search_Order_Diagnostics_02 {
    public static void main(String[] args) {

        int Arr[] = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int Val = 45;
        int Ans = OrderDiagnosticsBS(Arr, Val);
        System.out.println(Ans);

    }

    static int OrderDiagnosticsBS(int Arr[], int Val) {

        int low = 0;
        int High = Arr.length - 1;

        boolean IsAsc = Arr[low] < Arr[High];

        while (low <= High) {

            // Find the middle Element
            // int mid = (low + High)/ 2; // Might be possible that (low + High)
            int mid = low + (High - low) / 2;

            if (Arr[mid] == Val) {
                return mid;
            }

            if (IsAsc) {
                if (Val < Arr[mid]) {
                    High = mid - 1;
                } else {

                    low = mid + 1;
                }
            } else {
                if (Val > Arr[mid]) {
                    High = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
