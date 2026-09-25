class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        int xor = x ^ y;
        while (xor != 0) {
            ans += xor & 1;
            xor >>= 1;
        }
        return ans;
    }
}