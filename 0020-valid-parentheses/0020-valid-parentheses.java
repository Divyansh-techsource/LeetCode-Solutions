class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else {
                if (stk.isEmpty()) {
                    return false;
                }
                char top = stk.pop();
                if ((ch == ')' && top != '(')
                        || (ch == ']' && top != '[')
                        || (ch == '}' && top != '{'))
                    return false;
            }
        }
        return stk.isEmpty();
    }
}