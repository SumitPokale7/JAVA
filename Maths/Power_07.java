public class Power_07 {
    public static void main(String[] args) {

        int Base = 2;
        int Power = 4;
        System.out.println(p(Base, Power));
    }

    static int p(int Base, int Power) {

        int Ans = 1;

        while (Power > 0) {
            if ((Power & 1) == 1) {
                Ans *= Base;
            }
            Base *= Base;
            Power = Power >> 1;
        }
        return Ans;
    }
}
