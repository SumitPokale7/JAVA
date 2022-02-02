import java.util.ArrayList;

public class Dice_08 {
    public static void main(String[] args) {

        // DiceComb("", 4);
        // System.out.println(DiceComb2("", 4));
    }

    static void DiceComb(String Proc, int target) {
        if (target == 0) {
            System.out.println(Proc);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            DiceComb(Proc + i, target - i);
        }
    }

    // Returning a List
    static ArrayList<String> DiceComb2(String Proc, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(Proc);
            return list;
        }

        ArrayList<String> List = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            List.addAll(DiceComb2(Proc + i, target - i));
        }
        return List;
    }

    static int DiceComb3(String Proc, int target) {
        if (target == 0) {
            return 1;
        }

        int Count = 0;

        for (int i = 1; i <= 6 && i <= target; i++) {
            Count = Count + DiceComb3(Proc + i, target - i);
        }
        return Count;
    }

    //
    static void DiceComb4(String Proc, int target, int Face) {
        if (target == 0) {
            System.out.println(Proc);
            return;
        }

        for (int i = 1; i <= Face && i <= target; i++) {
            DiceComb4(Proc + i, target - i, Face);
        }
    }
}
