public class Main {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length) {
            return;
        }
        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }
        if (issafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        knight(board, row, col + 1, knights);
    }

    static boolean issafe(boolean[][] board, int row, int col) {
        if (isvalid(board, row - 2, col - 1) && board[row - 2][col - 1]) {
            return false;
        }
        if (isvalid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        }
        if (isvalid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        }
        if (isvalid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        }
        return true;
    }

    static boolean isvalid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[row].length;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean i : row) {
                if (i) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
