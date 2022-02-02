// Count Items Matching a Rule

// https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.List;

public class Count_Item_Matching_Rule {
    public static void main(String[] args) {

       
    }

    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
