public class Object_Class_01_02 {

    int num;
    float Gpa;

    Object_Class_01_02(int num, float Gpa) {
        this.num = num;
        this.Gpa = Gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Object_Class_01_02 obj = new Object_Class_01_02(34, 56.8f);
        Object_Class_01_02 obj2 = new Object_Class_01_02(12, 78.9f);

        if (obj == obj2) {
            System.out.println("Obj is equal to Obj2");
        }
        if (obj.equals(obj2)) {
            System.out.println("Obj is equal to Obj2");
        }

        // System.out.println(obj.hashCode());
    }
}
