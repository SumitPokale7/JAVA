public interface A_01 {

    // Static interface method should always have a body
    // Call via the interface Name
    static void Greeting() {
        System.out.println("I am Static Method");
    }

    default void Fun() {
        System.out.println("I am in A");
    }
}