class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[26];
        for (char ch : chars) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}