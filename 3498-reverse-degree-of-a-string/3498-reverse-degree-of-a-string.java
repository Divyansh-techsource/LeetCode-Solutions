class Solution {
    public int reverseDegree(String s) {
        int rev = 0;
        for (int i = 0; i < s.length(); i++) {
            rev += (97 + 26 - (int) (s.charAt(i))) * (i + 1);
        }
        return rev;
    }
}