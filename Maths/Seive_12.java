
// Sieve of Eronthesis

public class Seive_12 {
    public static void main(String[] args) {
        int n = 40;
        boolean[] Prims = new boolean[n + 1];
        System.out.println(Prims[0]);
        Sieve(n, Prims);
    }

    // False in Array means Number is Prime
    static void Sieve(int n, boolean[] Primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!Primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    Primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!Primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
