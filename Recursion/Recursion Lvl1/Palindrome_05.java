public class Palindrome_05 {
    public static void main(String[] args) {

    }

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

    // Palindrome
    static boolean Palin(int n) {
        return n == ReverseNoM2(n);
    }
}
