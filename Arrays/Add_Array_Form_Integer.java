// https://leetcode.com/problems/add-to-array-form-of-integer/

// Add_Array_Form_Integer

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Add_Array_Form_Integer {
    public static void main(String[] args) {

    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length - 1;
        ArrayList<Integer> al = new ArrayList<>();
        int carry = 0;
        while (n >= 0 && k > 0) {
            int rem = k % 10;
            k = k / 10;
            int sum = num[n] + rem;
            if (carry > 0) {
                sum += carry;
                carry = 0;
            }
            if (sum > 9) {
                int d = sum % 10;
                carry = sum / 10;
                sum = d;
            }
            al.add(sum);

            n--;
        }
        while (n >= 0) {
            int d = 0;
            d += num[n];
            if (carry > 0) {
                d += carry;
                carry = 0;
            }
            if (d > 9) {
                int d1 = d % 10;
                carry = d / 10;
                d = d1;
            }
            al.add(d);
            n--;
        }
        while (k > 0) {
            int d = 0;
            d += k % 10;
            k /= 10;
            if (carry > 0) {
                d += carry;
                carry = 0;
            }
            if (d > 9) {
                int d1 = d % 10;
                carry = d / 10;
                d = d1;
            }
            al.add(d);

        }
        if (carry > 0)
            al.add(carry);
        Collections.reverse(al);

        return al;
    }
}