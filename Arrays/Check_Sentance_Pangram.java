public class Check_Sentance_Pangram {
    public static void main(String[] args) {

        // String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }

    static public boolean checkIfPangram(String sentence) {
        // String str = new String(sentence);
        // boolean A = str.matches(sentence);

        // return A;

        String str = new String(sentence);
        if (str.length() < 26)
            return false;

        for (int c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1)
                return false;
        }

        return true;
    }
}
