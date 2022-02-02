// * --> Important Points

// Bit - Manupulation
// Operator
// 1. AND --> All the Numbers Between ANDs Everything Should be true then the
// Only
// Exprssion will be true
// * When you AND 1 with Every Number, Digits Remain the Same
// Use Case of AND
// Q1. Given a number N, Find if it's Even or Odd

// OR --> If Any one is true then the Entire Expression is true

// X-OR(^) --> (IF and Only If) --> If you Have Two No. then Only one of those
// Should be true
// * a ^ 1 = -a -(Compliment of No.)
// * a ^ 0 = a
// * a ^ a = 0

// Compliment(~)
// a = 10110
// -a(Compliment) = 01001

// Left Shift Operator(<<)   --> Moves it towards the Right
// * a<<1 = 2a
// 1010 << 10100

// Right Shift Operator(>>) --> Moves it towards the Right
// a >> b = a/2^b
//  0011001 >> 001100 

public class Bitwise_Operator_01 {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 2, 6, 3, 4 };
        System.out.println(FindU(arr));
    }

    // Q1. Given a number N, Find if it's Even or Odd
    static boolean isOdd(int n) {
        return (n & 1) == 0;
    }

    // Q2. Find Unique
    static int FindU(int arr[]) {
        int Unique = 0;
        for (int n : arr) {
            Unique ^= n;
        }
        return Unique;
    }

    // Q3. Find i'th Bit of an No.
}
