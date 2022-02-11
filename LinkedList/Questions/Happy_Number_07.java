
// https://leetcode.com/problems/happy-number/

// 202. Happy Number

public class Happy_Number_07 {

    public boolean isHappy(int n) {
        int Slow = n;
        int Fast = n;

        do {
            Slow = FindSquare(Slow);
            Fast = FindSquare(FindSquare(Fast));
        } while (Slow != Fast);

        if (Slow == 1) {
            return true;
        }
        return false;
    }

    private int FindSquare(int number) {
        int Ans = 0;

        while (number > 0) {
            int Remainder = number % 10;
            Ans += Remainder * Remainder;
            number /= 10;
        }
        return Ans;
    }
}
