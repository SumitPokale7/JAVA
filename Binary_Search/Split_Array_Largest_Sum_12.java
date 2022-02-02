public class Split_Array_Largest_Sum_12 {
    public static void main(String[] args) {

        int nums[] = { 7, 2, 5, 10, 8 };
        System.out.println(SplitArray(nums, 0));
    }

    static int SplitArray(int[] Nums, int m) {

        int Start = 0;
        int End = 0;
        for (int i = 0; i < Nums.length; i++) {
            Start = Math.max(Start, Nums[i]); // In the End of the loop this will Contain
            End += Nums[i];
        }

        // Binary Search
        while (Start < End) {
            // Try for the Middle as Potential Ans
            int Mid = Start + (End - Start) / 2;

            // Calculate How many Pieces you Can Divide this in with this Max Sum
            int Sum = 0;
            int Pieces = 1;
            for (int num : Nums) {
                if (Sum + num > Mid) {

                    // You Cannot add this is in Sub-Array, Make new one
                    // Say you add this Num is new Sub-Array, then Sum = Num

                    Sum = num;
                    Pieces++;
                } else {
                    Sum += num;
                }
            }
            if (Pieces > m) {
                Start = Mid + 1;
            } else {
                End = Mid;
            }
        }
        return End; // Here, Start == End
    }
}
