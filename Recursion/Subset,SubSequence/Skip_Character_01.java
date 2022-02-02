
public class Skip_Character_01 {
    public static void main(String[] args) {

        // SkipCharacter(" ", "baccdah");
        System.out.println(SkipCharacter2("baccdah"));
    }

    // 1. Pass the Ans String in Argument
    // 2. Create the Ans Variable in Function

    static void SkipCharacter(String P, String Up) {
        if (Up.isEmpty()) {
            System.out.println(P);
            return;
        }
        char ch = Up.charAt(0);
        if (ch == 'a') {
            SkipCharacter(P, Up.substring(1));
        } else {
            SkipCharacter(P + ch, Up.substring(1));
        }
    }

    static String SkipCharacter2(String Up) {
        if (Up.isEmpty()) {
            return "";
        }
        char ch = Up.charAt(0);
        if (ch == 'a') {
            return SkipCharacter2(Up.substring(1));
        }
        return ch + SkipCharacter2(Up.substring(1));
    }
}