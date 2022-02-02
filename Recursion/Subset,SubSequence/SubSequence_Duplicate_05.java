import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// When you  find a duplicate element only add it newly created 
//  Subset of Previous step 

//  Because of Above Point Duplicates have to be together
//  Sort the array

public class SubSequence_Duplicate_05 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 2 };
        List<List<Integer>> Ans = SubsetDuplicate(arr);
        for (List<Integer> list : Ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> SubsetDuplicate(int arr[]) {
        Arrays.sort(arr);
        List<List<Integer>> Outer = new ArrayList<>();

        Outer.add(new ArrayList<>());

        int Start = 0;
        int End = 0;
        for (int i = 0; i < arr.length; i++) {
            Start = 0;
            // If current and Previous element is Same, Start = End + 1
            if (i > 0 && arr[i] == arr[i - 1]) {
                Start = End + 1;
            }
            End = Outer.size() - 1;
            int Size = Outer.size();
            for (int j = Start; j < Size; j++) {
                List<Integer> Internal = new ArrayList<>(Outer.get(j));
                Internal.add(arr[i]);
                Outer.add(Internal);
            }
        }
        return Outer;
    }
}
