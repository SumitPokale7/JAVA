import java.util.ArrayList;
import java.util.List;

public class Subset_04 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3 };
        List<List<Integer>> Ans = Subset(arr);
        for (List<Integer> list : Ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> Subset(int arr[]) {
        List<List<Integer>> Outer = new ArrayList<>();

        Outer.add(new ArrayList<>());

        for (int num : arr) {
            int Size = Outer.size();
            for (int i = 0; i < Size; i++) {
                List<Integer> Internal = new ArrayList<>(Outer.get(i));
                Internal.add(num);
                Outer.add(Internal);
            }
        }
        return Outer;
    }
}
