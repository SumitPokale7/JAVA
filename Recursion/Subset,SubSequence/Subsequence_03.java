import java.util.ArrayList;

// Subset:
// When ever leads to Permutation And Combination
// Subset --> Non - Adjacent Collection

// Ex. [3, 5 ,9 ] = [3], [3, 5], [3, 9], [3, 5, 9], [5], [9]

// V.IMP --> This pattern of taking sum elements and Removing Sum
// is Known as Subset Pattern

public class Subsequence_03 {
    public static void main(String[] args) {
        // SubSeq("", "abc");
        // SubSeqAscii("", "abc");
        // System.out.println(SubSeq2("", "abc"));
        System.out.println(SubSeq4("", "abc"));
    }

    static void SubSeq(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            System.out.println(Proc);
            return;
        }
        char ch = UnProc.charAt(0);

        SubSeq(Proc + ch, UnProc.substring(1));
        SubSeq(Proc, UnProc.substring(1));
    }

    static ArrayList<String> SubSeq2(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            ArrayList<String> List = new ArrayList<>();
            List.add(Proc);
            return List;
        }
        char ch = UnProc.charAt(0);

        ArrayList<String> left = SubSeq2(Proc + ch, UnProc.substring(1));
        ArrayList<String> Right = SubSeq2(Proc, UnProc.substring(1));

        left.addAll(Right);
        return left;
    }

    static void SubSeqAscii(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            System.out.println(Proc);
            return;
        }
        char ch = UnProc.charAt(0);

        SubSeqAscii(Proc + ch, UnProc.substring(1));
        SubSeqAscii(Proc, UnProc.substring(1));
        SubSeqAscii(Proc + (ch + 0), UnProc.substring(1));
    }

    static ArrayList<String> SubSeq4(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            ArrayList<String> List = new ArrayList<>();
            List.add(Proc);
            return List;
        }
        char ch = UnProc.charAt(0);

        ArrayList<String> First = SubSeq4(Proc + ch, UnProc.substring(1));
        ArrayList<String> Second = SubSeq4(Proc, UnProc.substring(1));
        ArrayList<String> Third = SubSeq4(Proc + (ch + 0), UnProc.substring(1));

        First.addAll(Second);
        First.addAll(Third);
        return First;
    }
}
