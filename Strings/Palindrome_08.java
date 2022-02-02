
// abcdcba  --> This is Palindrome
// abcda    --> This is not Palindrome

public class Palindrome_08 {
    public static void main(String[] args) {
        String Str = "abcdcba";
        System.out.println(PalindRome(Str));
    }

    static boolean PalindRome(String str) {
        str = str.toLowerCase();
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i <= str.length() / 2; i++) {
            char Start = str.charAt(i);
            char End = str.charAt(str.length() - 1 - i);
            if (Start != End) {
                return false;
            }
        }
        return true;
    }
}