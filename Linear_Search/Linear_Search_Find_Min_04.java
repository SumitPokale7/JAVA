public class Linear_Search_Find_Min_04 {

    // Assume arr.length != 0
    // return the minimum value in the array
    static int Min(int arr[]) {
        int Ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < Ans) {
                Ans = arr[i];
            }
        }
        return Ans;
    }

    public static void main(String[] args) {

        int arr[] = { 18, 12, -7, 3, 14, 28 };
        System.out.println(Min(arr));
    }
}
