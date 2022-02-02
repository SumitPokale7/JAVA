public class Linear_Search_EvenDigit_06 {
    public static void main(String[] args) {

        int Nums[] = { 12, 345, 2, 6, 7895 };
        System.out.println(findNumber(Nums));

        // System.out.println(digit(0));
    }

    static int findNumber(int[] Nums) {
        int Count = 0;
        for (int Num : Nums) {
            if (Even(Num)) {
                Count++;
            }
        }
        return Count;
    }

    static boolean Even(int num) {
        int Numberofdigit = digit(num);

        // if (Numberofdigit % 2 == 0) {
        // return true;
        // }
        // return false;
        return Numberofdigit % 2 == 0;
    }

    // static int digit(int Num) {
    // if (Num < 0) {
    // Num = Num * -1;
    // }
    // if (Num == 0) {
    // return 1;
    // }
    // int count = 0;
    // while (Num > 0) {
    // count++;
    // Num = Num / 10;
    // }
    // return count;
    // }

    // 2nd Way to Find Optimized
    static int digit(int num) {
        return (int) (Math.log10(num)) + 1;
    }
}
