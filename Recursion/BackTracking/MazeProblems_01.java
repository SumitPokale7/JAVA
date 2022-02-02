
// Note:
//  When a choise affect future Ans use backtracking

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblems_01 {
    public static void main(String[] args) {

        // System.out.println(CountPaths(3, 3));
        // Path("", 3, 3);
        // System.out.println(PathRet("", 3, 3));
        // System.out.println(PathRetDiagonal("", 3, 3));

        boolean Board[][] = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        // PathWithRestriction("", Board, 0, 0);
        // AllPaths("", Board, 0, 0);

        int Path[][] = new int[Board.length][Board[0].length];

        AllPathsMatrix("", Board, 0, 0, Path, 1);
    }

    // Counting Number of Paths to get into 3,3
    static int CountPaths(int Row, int Col) {
        if (Row == 1 || Col == 1) {
            return 1;
        }

        int Left = CountPaths(Row - 1, Col);
        int Right = CountPaths(Row, Col - 1);

        return Left + Right;
    }

    // Printing Paths
    static void Path(String Proc, int Row, int Col) {
        if (Row == 1 && Col == 1) {
            System.out.println(Proc);
            return;
        }
        if (Row > 1) {
            Path(Proc + 'D', Row - 1, Col);
        }
        if (Col > 1) {
            Path(Proc + 'R', Row, Col - 1);
        }
    }

    // Returning Array List
    static ArrayList<String> PathRet(String Proc, int Row, int Col) {
        if (Row == 1 && Col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(Proc);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (Row > 1) {
            list.addAll(PathRet(Proc + 'D', Row - 1, Col));
        }
        if (Col > 1) {
            list.addAll(PathRet(Proc + 'R', Row, Col - 1));
        }
        return list;
    }

    // Going With Diagonally Also
    static ArrayList<String> PathRetDiagonal(String Proc, int Row, int Col) {
        if (Row == 1 && Col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(Proc);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (Row > 1 && Col > 1) {
            list.addAll(PathRetDiagonal(Proc + 'D', Row - 1, Col - 1));
        }
        if (Row > 1) {
            list.addAll(PathRetDiagonal(Proc + 'V', Row - 1, Col));
        }
        if (Col > 1) {
            list.addAll(PathRetDiagonal(Proc + 'H', Row, Col - 1));
        }
        return list;
    }

    // Path with Restriction
    static void PathWithRestriction(String Proc, boolean Maze[][], int Row, int Col) {
        if (Row == Maze.length - 1 && Col == Maze[0].length - 1) {
            System.out.println(Proc);
            return;
        }
        if (!Maze[Row][Col]) {
            return;
        }
        if (Row < Maze.length - 1) {
            PathWithRestriction(Proc + 'D', Maze, Row + 1, Col);
        }
        if (Col < Maze[0].length - 1) {
            PathWithRestriction(Proc + 'R', Maze, Row, Col + 1);
        }
    }

    // Including All Path
    static void AllPaths(String Proc, boolean Maze[][], int Row, int Col) {
        if (Row == Maze.length - 1 && Col == Maze[0].length - 1) {
            System.out.println(Proc);
            return;
        }
        if (!Maze[Row][Col]) {
            return;
        }

        // I am Considering this block in my path
        Maze[Row][Col] = false;

        if (Row < Maze.length - 1) {
            AllPaths(Proc + 'D', Maze, Row + 1, Col);
        }
        if (Col < Maze[0].length - 1) {
            AllPaths(Proc + 'R', Maze, Row, Col + 1);
        }
        if (Row > 0) {
            AllPaths(Proc + 'U', Maze, Row - 1, Col);
        }
        if (Col > 0) {
            AllPaths(Proc + 'L', Maze, Row, Col - 1);
        }

        // This line is where the Function will be Over
        // So before the Function gets removed, also remove
        // the changes that were made by function
        Maze[Row][Col] = true;
    }

    // Prints Matrix Of Path
    static void AllPathsMatrix(String Proc, boolean Maze[][], int Row, int Col, int Path[][], int Step) {
        if (Row == Maze.length - 1 && Col == Maze[0].length - 1) {
            Path[Row][Col] = Step;
            for (int[] arr : Path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(Proc);
            System.out.println();
            return;
        }
        if (!Maze[Row][Col]) {
            return;
        }

        // I am Considering this block in my path
        Maze[Row][Col] = false;
        Path[Row][Col] = Step;

        if (Row < Maze.length - 1) {
            AllPathsMatrix(Proc + 'D', Maze, Row + 1, Col, Path, Step++);
        }
        if (Col < Maze[0].length - 1) {
            AllPathsMatrix(Proc + 'R', Maze, Row, Col + 1, Path, Step++);
        }
        if (Row > 0) {
            AllPathsMatrix(Proc + 'U', Maze, Row - 1, Col, Path, Step++);
        }
        if (Col > 0) {
            AllPathsMatrix(Proc + 'L', Maze, Row, Col - 1, Path, Step++);
        }

        // This line is where the Function will be Over
        // So before the Function gets removed, also remove
        // the changes that were made by function
        Maze[Row][Col] = true;
        Path[Row][Col] = 0;
    }

}