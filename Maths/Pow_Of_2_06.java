public class Pow_Of_2_06 {
    public static void main(String[] args) {

        // Q. Your are given a Number, Find out it's Power of 2 or Not.

        int n = 32; // Note: Fix for n = 0;
        boolean Ans = (n & (n - 1)) == 0;
        System.out.println(Ans);
    }
}
