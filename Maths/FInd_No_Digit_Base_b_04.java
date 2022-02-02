
// Formula
// No. of Digit in Base b of No. n = int(log Base b n + 1)          

public class FInd_No_Digit_Base_b_04 {
    public static void main(String[] args) {
        int A = 34567;
        System.out.println(NoOfDigits(A));
    }

    static int NoOfDigits(int n) {

        int b = 10;
        // If you want to Convert Anything to Base b just Divide by the Same log that
        // with b.
        int Ans = (int) (Math.log(n) / Math.log(b)) + 1;
        return Ans;
    }
}
