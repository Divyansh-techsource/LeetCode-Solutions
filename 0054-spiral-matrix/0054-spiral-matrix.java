class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        boolean[][] vis = new boolean[n][m];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int r = 0, c = 0;
        int idx = 0;
        for (int i = 0; i < n * m; i++) {
            res.add(matrix[r][c]);
            vis[r][c] = true;
            int nr = r + dr[idx];
            int nc = c + dc[idx];
            if (0 <= nr && nr < n && 0 <= nc && nc < m && !vis[nr][nc]) {
                r = nr;
                c = nc;
            } else {
                idx = (idx + 1) % 4;
                r += dr[idx];
                c += dc[idx];
            }
        }
        return res;
    }
}