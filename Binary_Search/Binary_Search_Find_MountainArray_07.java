public class Binary_Search_Find_MountainArray_07 {
    public static void main(String[] args) {

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
}
