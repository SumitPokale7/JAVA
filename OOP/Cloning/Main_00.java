import java.util.Arrays;

public class Main_00 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Human_01 Kunal = new Human_01(34, "Kunal Kushwaha");
        // // Human_01 Twin = new Human_01(Kunal);

        // Human_01 Twin = (Human_01) Kunal.clone();
        // System.out.println(Twin.Age + " " + Twin.Name);
        // System.out.println(Arrays.toString(Twin.arr));

        // Twin.arr[0] = 100;
        // System.out.println(Arrays.toString(Twin.arr));

        Deep_Copy_02 Kunal = new Deep_Copy_02(34, "Kunal Kushwaha");
        // Human_01 Twin = new Human_01(Kunal);

        Deep_Copy_02 Twin = (Deep_Copy_02) Kunal.clone();
        System.out.println(Twin.Age + " " + Twin.Name);
        System.out.println(Arrays.toString(Twin.arr));

        Twin.arr[0] = 100;
        System.out.println(Arrays.toString(Kunal.arr));
    }
}
