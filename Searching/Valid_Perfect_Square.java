// https://leetcode.com/problems/valid-perfect-square/

// Valid Perfect Square

public class Valid_Perfect_Square {
    public static void main(String[] args) {

        int num = 52547;
        boolean Ans = isPerfectSquare(num);
        System.out.println(Ans);
    }

    static public boolean isPerfectSquare(int num) {
        int Start = 0;
        int End = num;

        if (num == 1) {
            return true;
        }
        while (Start <= End) {
            int Mid = Start + (End - Start) / 2;
            if (Mid * Mid == num) {
                return true;
            } else if (Mid * Mid < num) {
                Start = Mid + 1;
            } else {
                End = Mid - 1;
            }
        }
        return false;
    }
}
