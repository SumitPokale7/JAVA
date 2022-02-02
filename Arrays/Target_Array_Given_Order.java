
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSException;

//  https://leetcode.com/problems/create-target-array-in-the-given-order/

// Create Target Array in the Given Order

public class Target_Array_Given_Order {
    public static void main(String[] args) {

        int nums[] = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        System.out.println(createTargetArray(nums, index));
    }

    static public int[] createTargetArray(int[] nums, int[] index) {
        // creating an arrayList to insert the values
        // ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        // storing data into output array from the list
        int output[] = new int[list.size()];
        int x = 0;
        for (int i : list)
            output[x++] = i;
        return output;

    }
}
