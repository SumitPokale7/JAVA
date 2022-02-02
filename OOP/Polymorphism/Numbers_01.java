public class Numbers_01 {
    int Sum(int a, int b) {
        return a + b;
    }

    int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers_01 obj = new Numbers_01();

        obj.Sum(5, 8);
        obj.Sum(5, 8, 7);
    }
}
