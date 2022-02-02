import java.util.Arrays;

//  First Focus on what it's Doing then How it's Doing

// Pivot : Choose any Element 
// --> after first pass all the Elements < Pivot will be on Left Hand side of Pivot & 
//       Elements > Pivot will be at Right Hans Side of Pivot

// Q. How to put Pivot at Correct Position/Index?
//-> We will take 2 Pointer Fist at Start & Second at End

// Q.  How to Pick the Pivot?
// -> Pick a Random Number/Element,Pick Corner Element or Pick the Middle Element

//  IMP --> Complexity Compaison of Pivot Position
//  T(N) = T(K) + T(N - K - 1) + O(N)

// Worst Case
// K = 0 
// When Left/Right Hand Side is Empty

//  T(N) = T(O) + T(N-1) + O(N)
//  T(N) = T(N-1) + O(N)
//  T(N) = O(N^2) --> Worst Case

// Best Case
// T(N) = T(N/2) +  T(N/2) + O(N)
// T(N) = 2T(N/2) + O(N)

// V.IMP
//  1. Not Stable ( )
//  2. In-Place --> Why Preferred for arrays Instead,
//                         of Merge Sort take O(N) Extra Space 
// 3. Merge Sort is Better in Linked List due to Memory Allocation --> Not Contigous  

//  Hybrid Sorting Algorithms (Tim Sort)
//  Merge Sort + Insertion Sort

public class Quick_Sort {
    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1 };
        // Arrays.sort(arr);
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void QuickSort(int nums[], int Low, int High) {
        if (Low >= High) {
            return;
        }
        int Start = Low;
        int End = High;
        int Mid = Start + (End - Start) / 2;
        int Pivot = nums[Mid];

        while (Start <= End) {
            // Also a Reason why if it's Already Sorted it will not Swap
            while (nums[Start] < Pivot) {
                Start++;
            }
            while (nums[End] > Pivot) {
                End--;
            }
            if (Start <= End) {
                int temp = nums[Start];
                nums[Start] = nums[End];
                nums[End] = temp;
                Start++;
                End--;
            }
        }
        // Now my Pivot is at Correct Index, please sort two halves now,
        QuickSort(nums, Low, End);
        QuickSort(nums, Start, High);
    }
}
