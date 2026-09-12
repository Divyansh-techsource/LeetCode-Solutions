class Solution {
    static int N;
    static int[][] board;
    static List<List<String>> ans;

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
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < N; j++) {
                    if (board[i][j] == 1) {
                        sb.append('Q');
                    } else {
                        sb.append('.');
                    }
                }
                solution.add(sb.toString());
            }
            ans.add(solution);
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

    public List<List<String>> solveNQueens(int n) {
        N = n;
        board = new int[N][N];
        ans = new ArrayList<>();
        solve(0);
        return ans;
    }
}