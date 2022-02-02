
public class Box_Weight_01_03 extends Box_01 {
    double Weight;

    // @Override;
    static void Greeting() {
        System.out.println("Hey, I am in Box Weight Class, Greeting!");
    }

    Box_Weight_01_03() {
        this.Weight = -1;
    }

    Box_Weight_01_03(Box_Weight_01_03 Other) {
        super(Other);
        Weight = Other.Weight;
    }

    Box_Weight_01_03(double Side, double Weight) {
        super(Side);
        this.Weight = Weight;
    }

    Box_Weight_01_03(double L, double H, double W, double Weight) {
        super(L, H, W); // What is this? --> Call the Parent Class Constructor
        // Used to Initailze Values Present in Parent Class
        this.Weight = Weight;

    }
}
