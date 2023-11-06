// 1309. Decrypt String from Alphabet to Integer Mapping

class Solution {
    public String freqAlphabets(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();

        int i = 0;

        while(i < n) {
            if(i + 2 < n && s.charAt(i + 2) == '#') {
                String str = s.substring(i, i + 2);
                int temp = Integer.parseInt(str);
                char ch = (char)(temp + 96);
                result.append(ch);
                i += 3;
            }
            else {
                char ch = s.charAt(i);
                result.append((char)(ch + 48));
                i++;
            }
        }

        return result.toString();
    }
}