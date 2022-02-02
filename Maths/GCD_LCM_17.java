public class GCD_LCM_17 {
    public static void main(String[] args) {

        // System.out.println(Gcd(4, 8));
        System.out.println(Lcm(9, 18));
    }

    static int Gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return Gcd(b % a, a);
    }

    static int Lcm(int a, int b) {
        return a * b / Gcd(a, b);
    }
}
