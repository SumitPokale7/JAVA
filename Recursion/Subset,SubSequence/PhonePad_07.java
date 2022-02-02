// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

// Q. Letter Combination of a Phone Number

import java.util.ArrayList;

public class PhonePad_07 {
    public static void main(String[] args) {

        // Pad("", "12");
        // System.out.println(Pad2("", "12"));
        System.out.println(Pad3("", "12"));
    }

    static void Pad(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            System.out.println(Proc);
            return;
        }
        int Digit = UnProc.charAt(0) - '0'; // --> This Will Convert ' 2 ' into ' 2 '

        for (int i = (Digit - 1) * 3; i < Digit * 3; i++) {

            char ch = (char) ('a' + i);

            Pad(Proc + ch, UnProc.substring(1));

        }
    }

    // Returning Array List
    static ArrayList<String> Pad2(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(Proc);
            return list;
        }
        int Digit = UnProc.charAt(0) - '0'; // --> This Will Convert ' 2 ' into ' 2 '

        ArrayList<String> list = new ArrayList<>();

        for (int i = (Digit - 1) * 3; i < Digit * 3; i++) {

            char ch = (char) ('a' + i);

            list.addAll(Pad2(Proc + ch, UnProc.substring(1)));
        }
        return list;
    }

    // Returning count of Pad
    static int Pad3(String Proc, String UnProc) {
        if (UnProc.isEmpty()) {
            return 1;
        }
        int Count = 0;
        int Digit = UnProc.charAt(0) - '0'; // --> This Will Convert ' 2 ' into ' 2 '

        for (int i = (Digit - 1) * 3; i < Digit * 3; i++) {

            char ch = (char) ('a' + i);

            Count = Count + Pad3(Proc + ch, UnProc.substring(1));

        }
        return Count;
    }
}
