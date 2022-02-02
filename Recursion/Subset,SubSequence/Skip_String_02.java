public class Skip_String_02 {
    public static void main(String[] args) {
        System.out.println(SkipString2("dfgAppleadw"));
    }

    // Skip String
    static String SkipString(String Up) {
        if (Up.isEmpty()) {
            return "";
        }
        if (Up.startsWith("Apple")) {
            return SkipString(Up.substring(5));
        }
        return Up.charAt(0) + SkipString(Up.substring(1));
    }

    // Skip a String if it's not the Required String
    static String SkipString2(String Up) {
        if (Up.isEmpty()) {
            return "";
        }
        if (Up.startsWith("App") && !Up.startsWith("Apple")) {
            return SkipString2(Up.substring(5));
        }
        return Up.charAt(0) + SkipString2(Up.substring(1));
    }
}
