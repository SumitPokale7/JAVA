
public class Main_01_02 {
    public static void main(String[] args) {
        // Box_01 Box1 = new Box_01(4, 5, 9);
        // Box_01 Box2 = new Box_01(Box1);

        // Box_01.Greeting();

        // System.out.println(Box1.Length + " " + Box1.Width + " " + Box1.Height);

        // Box_Weight_01_03 Box3 = new Box_Weight_01_03();
        // Box_Weight_01_03 Box4 = new Box_Weight_01_03(4, 5, 6, 7);
        // System.out.println(Box3.Length + " " + Box3.Width + " " + Box3.Height + " " +
        // Box3.Weight);

        // Box_01 Box5 = new Box_Weight_01_03(2, 3, 4, 8);
        // System.out.println(Box5);

        // There are many Variables in Both Parent And Child Classes
        // you are given Access to variables that are in the Reference type
        // i.e. Box_Weight_01_03
        // Hence, you Should have Access to Weight Variable
        // This also Means, that the ones you are trying to Access should be Initailized
        // But here, When the Object itself is of type parent class,
        // How will you Call the Constructor of Child Class
        // That's Why Error

        // Box_Weight_01_03 Box6 = new Box_01(2, 3, 4, 8);
        // System.out.println(Box6);

        // Box_Price_01_04 Box7 = new Box_Price_01_04(5, 8, 200);

        // System.out.println(Box7);

        // Box_01 box = new Box_Weight_01_03();
        // Box_01.Greeting(); // --> You can Inherit but you cannot Override.
    }
}
