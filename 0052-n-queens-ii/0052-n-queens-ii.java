class Solution {

    static int N;
    static int[][] board;
    static int count;

    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    static void solve(int row) {
        if (row == N) {
            count++;
            return;
        }
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                solve(row + 1);
                board[row][col] = 0;
            }
        }
    }

    public int totalNQueens(int n) {
        N = n;
        board = new int[N][N];
        count = 0;
        solve(0);
        return count;
    }
}