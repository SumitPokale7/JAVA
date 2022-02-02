// https://leetcode.com/problems/flipping-an-image/

// Flipping an Image

public class Flipping_an_Image {
    public static void main(String[] args) {

        int image[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        System.err.println(flipAndInvertImage(image));
    }

    static public int[][] flipAndInvertImage(int[][] image) {
        int C = image[0].length;
        for (int[] Row : image) {
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int Temp = Row[i] ^ 1;
                Row[i] = Row[C - 1 - i] ^ 1;
                Row[C - 1 - i] = Temp;
            }
        }
        return image;
    }
}
