
// Q.   Why Recursion
// --> It helps us in Solving Bigger/Complex problem in a Simplar Way
// --> You can Convert Recursion Solution into iteration & Vise versa
// --> Space Complexity is Not Constant Because of Recursive Calls.
// --> It helps in Breaking Down Bigger Problems into Smaller Problems

public class Recursion_01 {
    public static void main(String[] args) {
        Print(1);
    }

    // No Base Condition --> Function call will keep Happing, Stack will be
    // Filled again and again

    // This will lead to Memory of Computer will Execede the limit --> StackOverflow

    static void Print(int n) {
        System.out.println(n);
        if (n == 5) {
            return;
        }
        // Recursive CAll
        // If you are calling a function again and again, You can treat it as Separate
        // call in the stack

        // Every Call of Function, will take Same Memory

        // This is Called Tail Recursion
        // This is the Last Function Call
        Print(n + 1);
    }
}
