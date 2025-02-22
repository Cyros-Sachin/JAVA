
public class sixtyfour {
    public static boolean issafe(String[][] board, int row, int col, int num) {

        for (int i = 0; i < board.length; i++) {
            if (board[row][i].equals(Integer.toString(num))) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][col].equals(Integer.toString(num))) {
                return false;
            }
        }
        int grow = (row / 3) * 3;
        int gcol = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[grow + i][gcol + j].equals(Integer.toString(num))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(String[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol =col+ 1;
        }

        if (!board[row][col].equals(".")) {
            if(helper(board, nrow, ncol)){
                return true;
            }
        } else {
            for (int j = 1; j <= 9; j++) {
                if (issafe(board, row, col, j)) {
                    board[row][col] = Integer.toString(j);
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = ".";
                    }
                }
            }
        }

        return false;

    }

    public static String[][] sudokusolve(String[][] board) {
        helper(board, 0, 0);
        return board;
    }

    public static void main(String[] args) {
        String[][] board = {
                { "5", "3", ".", ".", "7", ".", ".", ".", "." },
                { "6", ".", ".", "1", "9", "5", ".", ".", "." },
                { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                { "8", ".", ".", ".", "6", ".", ".", ".", "3" },
                { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                { "7", ".", ".", ".", "2", ".", ".", ".", "6" },
                { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                { ".", ".", ".", "4", "1", "9", ".", ".", "5" },
                { ".", ".", ".", ".", "8", ".", ".", "7", "9" }
        };
        String[][] solved = sudokusolve(board);
        for (int i = 0; i < solved.length; i++) {
            for (int j = 0; j < solved.length; j++) {
                System.out.print(solved[i][j] + " ");
            }
            System.out.println();
        }
    }
}
