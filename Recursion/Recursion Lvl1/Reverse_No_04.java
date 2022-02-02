public class Reverse_No_04 {
    public static void main(String[] args) {

        System.out.println(ReverseNoM2(1234321));
    }

    static int Sum = 0;

    // Method 1
    static void ReverseNo(int n) {
        if (n == 0) {
            return;
        }

        int Remainder = n % 10;
        Sum = Sum * 10 + Remainder;
        ReverseNo(n / 10);
    }

    // Sometimes, you Might some additional Variables in the arguments
    // in that Case, make Another Function

    // Method 2
    static int ReverseNoM2(int n) {
        int Digits = (int) (Math.log10(n)) + 1;
        return Helper(n, Digits);
    }

    static int Helper(int n, int Digits) {
        if (n % 10 == n) {
            return n;
        }
        int Remainder = n % 10;
        return Remainder * (int) (Math.pow(10, Digits - 1)) + Helper(n / 10, Digits - 1);
    }
}
