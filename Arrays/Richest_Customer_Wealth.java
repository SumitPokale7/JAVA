// https://leetcode.com/problems/richest-customer-wealth/

// Richest Customer Wealth
public class Richest_Customer_Wealth {
    public static void main(String[] args) {

    }

    static public int maximumWealth(int[][] accounts) {
        int MaxWealth = 0;
        int currCustomerWealth = 0;

        for (int[] account : accounts) {
            currCustomerWealth = 0;

            for (int Money : account) {
                currCustomerWealth += Money;
            }
            MaxWealth = Math.max(MaxWealth, currCustomerWealth);
        }
        return MaxWealth;

    }
}
