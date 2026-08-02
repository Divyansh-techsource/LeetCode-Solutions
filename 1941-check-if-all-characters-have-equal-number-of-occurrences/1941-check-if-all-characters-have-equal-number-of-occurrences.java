class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int val = freq[s.charAt(0) - 'a'];
        for (int count : freq) {
            if (count != 0 && count != val) {
                return false;
            }
        }
        return true;
    }
}