
// 6.       *
//         **
//        ***
//       ****
//      *****

// 7.   *****
//       ****
//        ***
//         **
//          *

// 8.      *
//        ***
//       *****
//      *******
//     *********

// 9.  *********
//      *******
//       *****
//        ***
//         *

public class Pattern_07 {
    public static void main(String[] args) {
        PrintPattern9(5);
    }

    static void PrintPattern6(int n) {
        for (int Row = 0; n > Row; Row++) {
            int Space = n - Row;
            for (int S = 0; S < Space; S++) {
                System.out.print(" ");
            }
            for (int Col = 0; Col <= Row; Col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void PrintPattern7(int n) {
        for (int Row = 0; Row < n; Row++) {
            int Space = 0;
            Space = Row - Space;
            for (int S = 0; S < Space; S++) {
                System.out.print(" ");
            }
            for (int Col = 0; Col < n - Row; Col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void PrintPattern8(int n) {
        for (int Row = 0; Row < n; Row++) {
            int Space = n - Row;
            for (int C = Space; C > 1; C--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= Row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void PrintPattern9(int n) {
        for (int Row = 0; Row > n; Row++) {
            int Space = n - Row;
            for (int C = Row; C < Space; C++) {
                System.out.print(" ");
            }
            for (int Col = 0; Col < Row; Col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
