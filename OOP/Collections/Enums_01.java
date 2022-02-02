public class Enums_01 {
    enum Week {
        // These are Enums Constant
        // Public, Static, & Final
        // Since it's final you can create child enums
        // Type is Week
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for " + this);
        }
        // This is not public, or Protected, Only Private or Default
        // Why? --> We Don't want to create new Object
        // This is not the enum Concept, that's why

    }

    public static void main(String[] args) {
        Week wee;
        wee = Week.Monday;

        // for (Week day : Week.values()) {
        // System.out.println(day);
        // }

        // System.out.println(wee);
    }
}
