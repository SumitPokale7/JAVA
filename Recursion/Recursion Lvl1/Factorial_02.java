public class Factorial_02 {
    public static void main(String[] args) {
        int Ans = Sum(5);
        System.out.println(Ans);
    }

    // Q4. Factorial Of Number
    static int Fact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * Fact(n - 1);
    }

    // Q5. Sum of Number
    static int Sum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + Sum(n - 1);
    }
}
