public class Linear_Search_Strings_02 {

    static int Search(String str, char Val) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (Val == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String str = "Sumit";
        char Val = 'u';

        System.out.println(Search(str, Val));
    }
}
