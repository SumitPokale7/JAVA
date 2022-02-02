public class InnerClasses_06 {
    static class Test {
        String Name;

        public Test(String Name) {
            this.Name = Name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("Rahul");
        System.out.println(a + " " + b);
    }
}
