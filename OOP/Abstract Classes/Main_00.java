
public class Main_00 {
    public static void main(String[] args) {
        Class_Son_01_02 Son = new Class_Son_01_02(30);
        Son.Carrer();

        Class_Daughter_01_03 Daughter = new Class_Daughter_01_03(20);
        Daughter.Carrer();

        // You Cannot Create Object of Abstract Classes
        // Class_Parent_01 Mom = new Class_Parent_01(45);

        Class_Parent_01.Hello();
        Son.Normal();
        
    }
}