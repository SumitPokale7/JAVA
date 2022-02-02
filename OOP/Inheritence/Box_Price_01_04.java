// 1. Single Inheritence :- One Class Extends Another Class
// 2. Multiple Inheritence :- One Class Extends More than One Class
// 3. Hiearchial Inheritence :- One Class is Inherited by Many Classes
// 4. Hybrid Inheritence :- Combination of Single And Multiple Inheritence

class Box_Price_01_04 extends Box_Weight_01_03 {

    double Cost;

    Box_Price_01_04() {
        super();
        this.Cost = -1;
    }

    Box_Price_01_04(Box_Price_01_04 Other) {
        super(Other);
        this.Cost = Other.Cost;
    }

    Box_Price_01_04(double L, double H, double W, double Weight, double Cost) {
        super(L, H, W, Weight);
        this.Cost = Cost;
    }

    Box_Price_01_04(double Side, double Weight, double Cost) {
        super(Side, Weight);
        this.Cost = Cost;
    }
}