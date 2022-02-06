public class Main_00 {
    public static void main(String[] args) {
        LL_00 List = new LL_00();
        List.InsertFirst(3);
        List.InsertFirst(32);
        List.InsertFirst(325);
        List.InsertFirst(3258);
        List.Display();
        List.Delete(3);
        List.Display();
    }
}
