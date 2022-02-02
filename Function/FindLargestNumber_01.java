public class FindLargestNumber_01 {
    public static void main(String[] args) {
        System.out.println(": " + Largest(3, 6, 1));
    }

    static int Largest(int a, int b, int c) {
        if (a < b || c < b) {
            return b;
        } else if (a > b || a > b) {
            return a;
        } else if (b < c || a < c) {
            return c;
        }
        return -1;
    }
}
