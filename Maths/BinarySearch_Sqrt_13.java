public class BinarySearch_Sqrt_13 {
    public static void main(String[] args) {

        int n = 40;
        int p = 3;
        System.out.printf("%.3f ", SQRT(n, p));
    }

    static double SQRT(int n, int p) {

        int Start = 0;
        int End = n;

        double Root = 0.0;

        while (Start <= End) {
            int Mid = Start + (End - Start) / 2;
            if (Mid * Mid == n) {
                return Mid;
            }
            if (Mid * Mid > n) {
                End = Mid - 1;
            } else {
                Start = Mid + 1;
            }
        }
        double Increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (Root * Root <= n) {
                Root += Increment;
            }
            Root -= Increment;
            Increment /= 10;
        }
        return Root;
    }
}
