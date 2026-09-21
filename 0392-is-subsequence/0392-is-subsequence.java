class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int l = 0;
        for (int r = 0; r < tArr.length; r++) {
            if (sArr[l] == tArr[r]) {
                l++;
                if (l == sArr.length) {
                    return true;
                }
            }
        }
        return false;
    }
}