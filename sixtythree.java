import java.util.ArrayList;
import java.util.List;

public class sixtythree {
    public static boolean issafe(int row, int col, char[][] board) {
        for (int i = col; i < board[row].length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        for (int i = col; i >= 0; i--) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        for (int i = row; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row; i >= 0; i--) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int c = col; c < board.length && r>=0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int c = col; r < board.length && c >=0; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void saveboard(char[][] board, List<List<String>> allboards) {
        String row="";
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row="";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]=='Q') {
                    row+="Q";
                }
                else{
                    row+=".";
                }
            }
            newBoard.add(row);
        }
        allboards.add(newBoard);
    }

    public static void helper(char[][] board, List<List<String>> allboards, int col) {
        if (col == board.length) {
            saveboard(board, allboards);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (issafe(i, col, board)) {
                board[i][col] = 'Q';
                helper(board, allboards, col + 1);
                board[i][col] = '.';
            }
        }
    }

    public static List<List<String>> nqueen(int n) {
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allboards, 0);
        return allboards;
    }

    public static void main(String[] args) {
        List<List<String>> allboards=nqueen(4);
        for (int i = 0; i < allboards.size(); i++) {
            System.err.println(allboards.get(i));
        }
    }
}
