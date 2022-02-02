package Shapes;

class Circle_01_02 extends Shapes_01 {
    // This will run when Obj of Circle is Created
    // Hence, It is Overriding the Parent Method
    @Override // This is Called Annotation
    void Area() {
        System.out.println("Area is Pie * R * R");
    }
}