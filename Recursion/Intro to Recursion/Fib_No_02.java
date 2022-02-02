
//  Note: How to Understand & Approach a Recursion Problem
// 1. Identify if you can break down problem into Smaller Problem
// 2. Write the Recurrsion Relation if needed.
// 3. Draw the Recursion Tree.
// 4. About the Tree.
// 5. See the Flow of Function, How they are getting in Stack.
// 6. Identify & Flow/Focus of on left tree calls and Right tree calls.
// 7. Draw the tree & Position Again & Again using Pen & Paper.
// 8. Use the Debuger to See the flow.
// 9. See How the Values are Returned at Each Step.
//10.See Where the two Function call will come out of in the End,
//     you will Come out of the Function.

// VVVVVVVVIMP
// Variables in  Recursion   
// 1. Arguments,2. Return type,3. Body of the Function

public class Fib_No_02 {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        System.out.println(FibNo(50));
        // }
    }

    static int FiboacciNo(int n) {
        if (n <= 1)
            return 1;
        return FiboacciNo(n - 1) + FiboacciNo(n - 2);
    }

    // Finding Nth Fibonacci Np. using Golden ration Formula
    static int FibNo(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
