
public class Q1_01 {
    public static void main(String[] args) {
        Nto1(5);
    }

    static void Concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // Concept(n--); --> Will Only Print 5 Again & Again
        Concept(--n);
    }

    // Q1. N to 1
    // Q2. 1 to N
    // Q3. 1 to N & N to 1
    static void Nto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Nto1(n - 1);
        System.out.println(n);
    }
}