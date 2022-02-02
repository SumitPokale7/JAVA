//       What is Singleton Class?
// --> A Class Which You can That create only One object 

public class Singleton_Class_07 {
    private Singleton_Class_07() {

    }

    private static Singleton_Class_07 instance;

    public static Singleton_Class_07 getInstance() {

        // Check Whether 1 Obj Only is Created or Not
        if (instance == null) {
            instance = new Singleton_Class_07();
        }
        return instance;
    }

}
