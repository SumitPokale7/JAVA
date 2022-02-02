public class A_01 {
    // Nested Interface
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B_02 implements A_01.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

class Main {
    public static void main(String[] args) {
        B_02 Obj = new B_02();
        System.out.println(Obj.isOdd(5));
    }
}