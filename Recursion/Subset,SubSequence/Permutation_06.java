
import java.util.ArrayList;

public class Permutation_06 {
    public static void main(String[] args) {

        // Permutation("", "abc");
        // ArrayList<String> list = Permutation2("", "abc");
        // System.out.println(list);

        System.out.println(Permutation3("", "abcd"));
    }

    static void Permutation(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            System.out.println(Proc);
            return;
        }

        char ch = UnProc.charAt(0);

        for (int i = 0; i <= Proc.length(); i++) {
            String First = Proc.substring(0, i);
            String Second = Proc.substring(i, Proc.length());
            Permutation(First + ch + Second, UnProc.substring(1));
        }
    }

    static ArrayList<String> Permutation2(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(Proc);
            return list;
        }

        char ch = UnProc.charAt(0);

        ArrayList<String> Ans = new ArrayList<>();

        for (int i = 0; i <= Proc.length(); i++) {
            String First = Proc.substring(0, i);
            String Second = Proc.substring(i, Proc.length());
            Ans.addAll(Permutation2(First + ch + Second, UnProc.substring(1)));
        }
        return Ans;
    }

    static int Permutation3(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            return 1;
        }

        int Count = 0;
        char ch = UnProc.charAt(0);

        for (int i = 0; i <= Proc.length(); i++) {
            String First = Proc.substring(0, i);
            String Second = Proc.substring(i, Proc.length());
            Count = Count + Permutation3(First + ch + Second, UnProc.substring(1));
        }
        return Count;
    }
}
