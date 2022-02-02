
// VVVVVVVVIMP
// Variables in  Recursion   
// 1. Arguments  --> If there are few variables that you need to pass in the
//                             future function calls put into the Arguments
// 2. Return type --> Return the Same as Sub-Condition
// 3. Body of the Function --> This is Need to be Specific to That call
// Make Sure to Return the Result of if Function call of the return type;

// Recursion in Binary Search
// 1. Comparing --> O(1)   --> The target Element is Bigger or Smaller or is Equal to 
// 2. Dividing into 2 Half --> F(N/2) 

//  Recurence Relation --> F(N) = O(1) + F(N/2)

// Types of Recurence Relation
// 1. Linear Recurence Relation --> Ex. Fibonacci Number
// 2. Divide & Conquer Recurence Relation --> Ex. Binary Search

public class Binary_Search_03 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 55, 66, 78, 85 };
        System.out.println(Search(arr, 4, 0, arr.length - 1));
    }

    static int Search(int arr[], int target, int Start, int End) {
        if (Start > End) {
            return -1;
        }
        int Middle = Start + (End - Start) / 2;

        if (arr[Middle] == target) {
            return Middle;
        }
        if (target < arr[Middle]) {
            return Search(arr, target, Start, Middle - 1);
        }
        return Search(arr, target, Middle + 1, End);
    }
}
