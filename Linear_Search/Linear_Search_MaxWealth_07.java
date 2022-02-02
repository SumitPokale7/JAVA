public class Linear_Search_MaxWealth_07 {
    public static void main(String[] args) {

    }

    public int MaxiMumWealth(int Accounts[][]) {
        // Person = Rol;
        // Account = Col;

        int Ans = Integer.MIN_VALUE;
        for (int[] ints : Accounts) {
            // When you start a new col, a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            // Now we Have sum of Accounts of Person
            // Check with overrall Ans

            if (sum > Ans) {
                Ans = sum;
            }
        }
        return Ans;
    }
}
