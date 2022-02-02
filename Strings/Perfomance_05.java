public class Perfomance_05 {
    public static void main(String[] args) {
        String Series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            // System.out.println(ch);
            Series = Series + ch; // Series += ch --> Same thing
        }
        System.out.println(Series);
    }
}
