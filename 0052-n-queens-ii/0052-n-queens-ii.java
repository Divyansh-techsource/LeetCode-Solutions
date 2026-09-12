class Solution {
    int count = 0;
    int n;

    public int totalNQueens(int n) {
        this.n = n;
        boolean rowUsed[] = new boolean[n];
        boolean colUsed[] = new boolean[n];
        boolean leftDiagUsed[] = new boolean[2 * n - 1];
        boolean rightDiagUsed[] = new boolean[2 * n - 1];
        solve(0, rowUsed, colUsed, leftDiagUsed, rightDiagUsed);
        return count;
    }

    void solve(int r, boolean[] row, boolean[] col, boolean[] leftDiag, boolean[] rightDiag) {
        if (r == n) {
            count++;
            return;
        }
        for (int c = 0; c < n; c++) {
            if (row[r] == true) {
                continue;
            }
            if (col[c] == true) {
                continue;
            }
            if (rightDiag[r + c] == true) {
                continue;
            }
            if (leftDiag[r - c + n - 1] == true) {
                continue;
            }
            row[r] = true;
            col[c] = true;
            leftDiag[r - c + n - 1] = true;
            rightDiag[r + c] = true;
            solve(r + 1, row, col, leftDiag, rightDiag);
            row[r] = false;
            col[c] = false;
            leftDiag[r - c + n - 1] = false;
            rightDiag[r + c] = false;
        }
    }
}