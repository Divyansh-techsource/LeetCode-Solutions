class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        boolean[] inStack = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']--;
            if (inStack[ch - 'a']) {
                continue;
            }
            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && freq[stack.peek() - 'a'] > 0) {

                inStack[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            inStack[ch - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : stack) {
            ans.append(ch);
        }
        return ans.toString();
    }
}