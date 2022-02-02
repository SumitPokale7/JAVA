public class Sum_Of_Digit_03 {
    public static void main(String[] args) {
        int Ans = SumOfDigit(13542);
        System.out.println(Ans);
    }

    // Q6. Sum Of Digits
    static int SumOfDigit(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + SumOfDigit(n / 10);
    }

    // Q7. Product Of Digit
    static int ProductOfDigit(int n) {

        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * ProductOfDigit(n / 10);
    }
}
