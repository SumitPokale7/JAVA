// public final class Box_01 {
// Whenever put a class has a final Implicitly
//  Declares Method Final too

public class Box_01 {

    double Length;
    double Height;
    double Width;

    static void Greeting() {
        System.out.println("Hey, I am in Box Class, Greeting!");
    }

    Box_01() {

        // super(); --> Object Class

        this.Height = -1;
        this.Length = -1;
        this.Width = -1;
    }

    // Cube
    Box_01(double Side) {
        this.Height = Side;
        this.Length = Side;
        this.Width = Side;
    }

    Box_01(double l, double H, double W) {
        this.Height = H;
        this.Length = l;
        this.Width = W;
    }

    Box_01(Box_01 Old) {
        this.Height = Old.Height;
        this.Length = Old.Length;
        this.Width = Old.Width;
    }

    public void Information() {
        System.out.println("Running the Box");
    }
}
