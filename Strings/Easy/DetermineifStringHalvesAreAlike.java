// 1704. Determine if String Halves Are Alike

class Solution {

    public boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            return true;
        }

        return false;
    }

    public boolean halvesAreAlike(String s) {
        int start = 0;
        int end = s.length() - 1;
        int a_count = 0;
        int b_count = 0;

        while(start < end) {
            if(isVowel(s.charAt(start))) {
                a_count++;
            }
            if(isVowel(s.charAt(end))) {
                b_count++;
            }
            start++;
            end--;
        }

        if(a_count == b_count) {
            return true;
        }

        return false;
    }
}