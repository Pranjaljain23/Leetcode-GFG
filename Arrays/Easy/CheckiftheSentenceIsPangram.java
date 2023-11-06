//sentence should contains at least one of every letter of the English alphabet

// 1832. Check if the Sentence Is Pangram


class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];

        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            freq[ch - 'a']++;
        }

        for(int num : freq) {
            if(num == 0) {
                return false;
            }
        }

        return true;
    }
}