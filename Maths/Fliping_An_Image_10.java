// https://leetcode.com/problems/flipping-an-image/

// Flipping an Image

public class Fliping_An_Image_10 {
    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] Row : image) {
            // Reverse this Array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // Swap
                int temp = Row[i] ^ 1;
                Row[i] = Row[image[0].length - i - 1] ^ 1;
                Row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
