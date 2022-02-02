public class RangeXOR_09 {
    public static void main(String[] args) {

        // Range XOR for a,b = XOR(b)^ XOR(a-1)
        int a = 3;
        int b = 9;
        int Ans = RangeXoR(b) ^ RangeXoR(a - 1);
        System.out.println(Ans);

        // Only for Check, will give TLE for Large Numbers
        // int Ans2 = 0;
        // for (int i = a; i <= b; i++) {
        // Ans2 ^= i;
        // }
        // System.out.println(Ans2);
    }

    // This gives XOR form 0 to a
    static int RangeXoR(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        return 0;
    }
}
