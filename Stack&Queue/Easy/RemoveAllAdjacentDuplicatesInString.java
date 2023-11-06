// 1047. Remove All Adjacent Duplicates In String

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(stack.isEmpty() || stack.peek() != ch) {
                stack.push(ch);
            }
            else {
                stack.pop();
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}