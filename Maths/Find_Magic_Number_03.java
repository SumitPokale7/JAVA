public class Find_Magic_Number_03 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(FindMagic(n));
    }

    static int FindMagic(int n) {
        int Ans = 0;
        int Base = 5;

        while (n > 0) {
            int Last = n & 1;
            n = n >> 1;
            Ans += Last * Base;
            Base = Base * 5;
        }
        return Ans;
    }
}
