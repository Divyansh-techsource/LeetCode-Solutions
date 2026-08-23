class Solution {
    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        reverse(chars, 0, n - 1);
        int i = 0;
        for (int l = 0; l < n; ++l) {
            if (chars[l] != ' ') {
                if (i != 0)
                    chars[i++] = ' ';
                int r = l;
                while (r < n && chars[r] != ' ')
                    chars[i++] = chars[r++];
                reverse(chars, i - (r - l), i - 1);
                l = r;
            }
        }
        return new String(chars, 0, i);
    }
}