public class String_Builder_06 {
    public static void main(String[] args) {
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            SB.append(ch);
        }
        System.out.println(SB);

        // System.out.println(SB.deleteCharAt(0));

    }
}
