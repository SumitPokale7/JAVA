package Comaparing_object;

import java.util.ArrayList;

public class Lambda_Function {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // arr.forEach((item) -> System.out.println(item * 2));

        Operation sum = (a, b) -> a + b;
        Operation Prod = (a, b) -> a * b;
        Operation Sub = (a, b) -> a - b;

        Lambda_Function fun = new Lambda_Function();
        System.out.println(fun.OP(5, 3, sum));
        System.out.println(fun.OP(5, 3, Prod));
        System.out.println(fun.OP(5, 3, Sub));
    }

    private int OP(int a, int b, Operation Op) {
        return Op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
