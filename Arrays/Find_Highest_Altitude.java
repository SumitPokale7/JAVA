
public class Find_Highest_Altitude {

    public static void main(String[] args) {

        int gain[] = { -4, -3, -2, -1, 4, 3, 2 };
        // int gain[] = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain));
    }

    static public int largestAltitude(int[] gain) {

        int Sum = 0;
        int Max = 0;
        for (int i = 0; i < gain.length; i++) {
            Sum += gain[i];
            Max = Math.max(Sum, Max);
        }
        return Max;
    }
}
