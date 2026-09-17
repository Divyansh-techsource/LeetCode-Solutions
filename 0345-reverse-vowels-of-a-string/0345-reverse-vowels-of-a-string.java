class Solution {
    public String reverseVowels(String s) {
        String v = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && v.indexOf(ch[i]) == -1) {
                i++;
            }
            while (i < j && v.indexOf(ch[j]) == -1) {
                j--;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}