// 125. Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start <= end) {
            char cs = s.charAt(start);
            char ls = s.charAt(end);

            if(!Character.isLetterOrDigit(cs)) {
                start++;
            }
            else if(!Character.isLetterOrDigit(ls)) {
                end--;
            }
            else {
                if(Character.toLowerCase(cs) != Character.toLowerCase(ls)) {
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;
    }
}