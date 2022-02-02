
public class Main_01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            Divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always Execute");
        }
    }

    static int Divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not Divide by Zero");
        }
        return a / b;
    }
}