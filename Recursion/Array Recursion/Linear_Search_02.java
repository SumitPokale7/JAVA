import java.util.ArrayList;

public class Linear_Search_02 {
    public static void main(String[] args) {

        int arr[] = { 3, 2, 1, 18, 9, 18, 52, 1, 81, 18 };
        // System.out.println(LinearSearch(arr, 18, 0));
        // FindAllIndex(arr, 18, 0);
        // System.out.println(list);

        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> Ans = ArrayList(arr, 18, 0, list);
        // System.out.println(Ans);
        // System.out.println(list);

        System.out.println(ArrayList2(arr, 18, 0));
    }

    static int LinearSearch(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return LinearSearch(arr, target, index + 1);
    }

    static int FindIndexLast(int arr[], int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return FindIndexLast(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void FindAllIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        FindAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> ArrayList(int arr[], int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return ArrayList(arr, target, index + 1, list);
    }

    static ArrayList<Integer> ArrayList2(int arr[], int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // This will Contain Answer for that Function call Only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> AnsFromBelowCalls = ArrayList2(arr, target, index + 1);

        list.addAll(AnsFromBelowCalls);

        return list;
    }
}
