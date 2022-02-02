public class Find_SetBits_08 {
    public static void main(String[] args) {
        // Q. Given a Number n, Find the no. of Set Bits in it.
        int n = 37;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(CountS(n));
    }

    static int CountS(int n) {
        int Count = 0;
        while (n > 0) {
            Count++;
            n -= (n & -n);
        }

        // while (n > 0) {
        // Count++;
        // n = n & (n - 1);
        // }
        return Count;
    }
}
