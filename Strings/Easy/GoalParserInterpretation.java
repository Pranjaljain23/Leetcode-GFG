// 1678. Goal Parser Interpretation

class Solution {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder str = new StringBuilder("");
        int i = 0;
        char ch;

        while(i < n) {
            ch = command.charAt(i);
            if(ch == 'G') {
                str.append('G');
                i++;
            }
            if(ch == '(') {
                if(command.charAt(i + 1) == ')') {
                    str.append('o');
                    i += 2;
                }
                else {
                    str.append("al");
                    i += 4;
                }
            }
        }
        
        return str.toString();
    }
}