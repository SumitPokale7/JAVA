
// Newton Raphson Method

// Compexity --> O((log n) f(n))
// f(n) --> The Cost of Calculating f(n)/f ' (n) with Sum of  n digits 

// Root = Sqrt(x+ n/x)/2

// Error  --> (Root - x)

// Root   --> Actual Sqrt
// x        --> Sqrt you Have Assumed

// Why the Formula Works?

public class Newton_RapsonM_14 {
    public static void main(String[] args) {

        System.out.println(Sqrt(40));
    }

    static double Sqrt(double n) {
        double x = n;
        double Root;

        while (true) {
            Root = 0.5 * (x + (n / x));

            if (Math.abs(Root - x) < 0.5) {
                break;
            }
            x = Root;
        }
        return Root;
    }
}
