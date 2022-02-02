public class Count_Zer_06 {
    public static void main(String[] args) {

        System.out.println(Count(100200));
    }

    static int Count(int n) {
        return Helper(n, 0);
    }

    // Special Pattern, How to pass a value to above Calls
    static int Helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int Remainder = n % 10;
        if (Remainder == 0) {
            return Helper(n / 10, c + 1);
        }
        return Helper(n / 10, c);
    }
}
