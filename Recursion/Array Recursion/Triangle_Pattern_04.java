public class Triangle_Pattern_04 {
    public static void main(String[] args) {
        // TrianglePattern1(4, 0);
        // TrianglePattern2(4, 0);
    }

    static void TrianglePattern1(int Row, int Col) {
        if (Row == 0) {
            return;
        }
        if (Col < Row) {
            System.out.print("*");
            TrianglePattern1(Row, Col + 1);
        } else {
            System.out.println();
            TrianglePattern1(Row - 1, 0);
        }
    }

    static void TrianglePattern2(int Row, int Col) {
        if (Row == 0) {
            return;
        }
        if (Col < Row) {
            TrianglePattern2(Row, Col + 1);
            System.out.print("*");
        } else {
            TrianglePattern2(Row - 1, 0);
            System.out.println();
        }
    }
}
