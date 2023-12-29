public class Main {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
    }

    static int queens(boolean[][] board, int r) {
        if (r == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (issafe(board, r, i)) {
                board[r][i] = true;
                count += queens(board, r + 1);
                board[r][i] = false;
            }
        }
        return count;
    }

    static boolean issafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int maxleft = Math.min(row, col);
        for (int i = 1; i <= maxleft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int maxright = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxright; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean i : row) {
                if (i) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println(); 
        }
    }
}
