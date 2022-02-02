// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

// . Number of Steps to Reduce a Number to Zero

public class Number_Steps_07 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    static int numberOfSteps(int num) {
        return Helper(num, 0);
    }

    static int Helper(int num, int Steps) {
        if (num == 0) {
            return Steps;
        }
        if (num % 2 == 0) {
            return Helper(num / 2, Steps + 1);
        }
        return Helper(num - 1, Steps + 1);
    }
}
